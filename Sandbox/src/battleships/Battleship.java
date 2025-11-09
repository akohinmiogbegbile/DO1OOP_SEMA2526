package battleships;



public class Battleship {

	

	// Positional coordinates (x , y)

	int x1, y1, x2, y2, x3, y3;

	

	// Direction (true = horizontal; false = vertical)

	boolean isHorizontal;

	

	// Ship length (2 - 3 tiles long)

	int length;

	

	// Status ~ healthy, damaged, or destroyed

	String status;

	

	int damageCounter;

	

	// Constructor

	public Battleship(String grid, int gridSize, int shipSize) {

 status = "healthy";

 damageCounter = 0;

 length = shipSize;

 isHorizontal = (int) (Math.random() * 2) == 0;



 // Find suitable position (grid parameter must be passed through prior to game play)

 do {

 // Select random tile

 int randTileCoordX1 = (int) (Math.random() * gridSize);

 int randTileCoordY1 = (int) (Math.random() * gridSize);

 

 // Select adjacent tiles

 int tileCoordX2, tileCoordY2, tileCoordX3, tileCoordY3;

 

 if (isHorizontal) {

 tileCoordX2 = randTileCoordX1 + 1;

 tileCoordY2 = randTileCoordY1;

 

 tileCoordX3 = randTileCoordX1 + 2;

 tileCoordY3 = randTileCoordY1;

 } else {

 tileCoordX2 = randTileCoordX1;

 tileCoordY2 = randTileCoordY1 + 1;

 

 tileCoordX3 = randTileCoordX1;

 tileCoordY3 = randTileCoordY1 + 2;

 }

 

 // Check if tiles are empty (recycled logic from grid class, see for more details)

 int charIndex1 = (2 * randTileCoordX1) + ((gridSize + 1) * 2 * randTileCoordY1) + (gridSize * 2) + 4;

 int charIndex2 = (2 * tileCoordX2) + ((gridSize + 1) * 2 * tileCoordY2) + (gridSize * 2) + 4;

 int charIndex3 = (2 * tileCoordX3) + ((gridSize + 1) * 2 * tileCoordY3) + (gridSize * 2) + 4;



 // Grid string has a max length, so need to filter random cases in which charIndex* > max length - 3



 if ((charIndex1 < (grid.length() - 3)) && (charIndex2 < (grid.length() - 3)) && (charIndex3 < (grid.length() - 3))) {

 

 // Selection based on shipSize (2 or 3 tiles long)

 if (shipSize == 3) {

 if (grid.charAt(charIndex1) == '-' && grid.charAt(charIndex2) == '-' && grid.charAt(charIndex3) == '-') {

 x1 = randTileCoordX1;

 y1 = randTileCoordY1;

 x2 = tileCoordX2;

 y2 = tileCoordY2;

 x3 = tileCoordX3;

 y3 = tileCoordY3;

 break;

 }

 } else {

 if (grid.charAt(charIndex1) == '-' && grid.charAt(charIndex2) == '-') {

 x1 = randTileCoordX1;

 y1 = randTileCoordY1;

 x2 = tileCoordX2;

 y2 = tileCoordY2;

 break;

 }

 }

 }

 } while (true);

	}

	

	// Method: represent positional coordinates in a string

	public String coordinates() {

 String coords;

 

 if (length == 3) {

 coords = "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")" + "(" + x3 + "," + y3 + ")";

 } else {

 coords = "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")";

 }

 

 return coords;

	}

	

}