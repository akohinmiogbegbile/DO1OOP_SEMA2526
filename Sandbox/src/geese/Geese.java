// Simple Goose Collecting Game
// By: Inmi

// Goose position
float gooseX, gooseY;

// Item position
float itemX, itemY;

// Score counter
int score = 0;

void setup() {
  size(800, 600);

  // Start goose in the center
  gooseX = width / 2;
  gooseY = height / 2;

  // Place first item randomly
  spawnNewItem();
}

void draw() {
  background(135, 206, 250); // light blue water

  drawWaterWaves();        // slight background decoration
  drawGoose(gooseX, gooseY); 
  drawItem(itemX, itemY);
  drawScore();

  moveGoose();
  checkCollection();
}

// ---------------------------
// Draw the goose (simple shapes)
// ---------------------------
void drawGoose(float x, float y) {
  // Body
  fill(255); 
  ellipse(x, y, 50, 35);

  // Head
  ellipse(x + 30, y - 10, 25, 25);

  // Beak
  fill(255, 165, 0);
  triangle(x + 40, y - 10, x + 55, y - 5, x + 40, y);
}

// ---------------------------
// Draw collectible item
// ---------------------------
void drawItem(float x, float y) {
  fill(255, 215, 0); 
  ellipse(x, y, 20, 20); // golden circle item
}

// ---------------------------
// Move goose with arrow keys
// ---------------------------
void moveGoose() {
  if (keyPressed) {
    if (keyCode == UP)    gooseY -= 4;
    if (keyCode == DOWN)  gooseY += 4;
    if (keyCode == LEFT)  gooseX -= 4;
    if (keyCode == RIGHT) gooseX += 4;
  }

  // Prevent leaving screen
  gooseX = constrain(gooseX, 0, width);
  gooseY = constrain(gooseY, 0, height);
}

// ---------------------------
// Check if goose collects item
// ---------------------------
void checkCollection() {
  float d = dist(gooseX, gooseY, itemX, itemY);

  if (d < 40) {   // touching distance
    score++;
    spawnNewItem();
  }
}

// ---------------------------
// Put new item in random place
// ---------------------------
void spawnNewItem() {
  itemX = random(50, width - 50);
  itemY = random(50, height - 50);
}

// ---------------------------
// Score display
// ---------------------------
void drawScore() {
  fill(0);
  textSize(24);
  text("Collected: " + score, 20, 40);
}

// ---------------------------
// Simple water wave design
// ---------------------------
void drawWaterWaves() {
  stroke(255, 255, 255, 60); // faint white lines
  strokeWeight(2);

  for (int i = 0; i < height; i += 40) {
    line(0, i, width, i);
  }

  noStroke();
}
