package battleships;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 // Initialise Scanner Object

		 Scanner sc = new Scanner(System.in);

		 
			//2 test
		 // Pre-game: choose grid size

		 System.out.println("Welcome to Battleships!");

		 

		 int gridSize = 0;

		 

		 while (gridSize < 5 || gridSize > 10) {

		 System.out.print("Please choose a grid size (5 - 10): ");

		 gridSize = sc.nextInt();

		 }

		 

		 System.out.println("You've chosen a " + gridSize + " x " + gridSize + " grid.");

		 

		 // Initialise Grid Object

		 Grid grid = new Grid(gridSize);

		 

		 System.out.println();

		 System.out.println(grid.grid);

		 

		 // Duplicate used for battleship object initialisations

		 Grid gridCopy = new Grid(gridSize);

		 

		 // Initialise Battleship Objects

		 Battleship ship1 = new Battleship(gridCopy.grid, gridSize, 2);

		 gridCopy.update(ship1.x1, ship1.y1, 'x');

		 gridCopy.update(ship1.x2, ship1.y2, 'x');

		 

		 Battleship ship2 = new Battleship(gridCopy.grid, gridSize, 3);

		 gridCopy.update(ship2.x1, ship2.y1, 'x');

		 gridCopy.update(ship2.x2, ship2.y2, 'x');

		 gridCopy.update(ship2.x3, ship2.y3, 'x');

		 

		 Battleship ship3 = new Battleship(gridCopy.grid, gridSize, 3);

		 

		 // For TESTING purposes ONLY!

		 

		// String shipCoordinates = ship1.coordinates() + ship2.coordinates() + ship3.coordinates();

		// System.out.println("Cheats: ");

		// System.out.println(shipCoordinates);

		// System.out.println();

		 

		 

		 // Game play

		 System.out.println("There are 3 hidden battleships that you need to destroy!");

		 System.out.println("You have gained intelligence that the enemy has a fleet consisting of the following:");

		 System.out.println("x1 small battleship (2 tiles long)");

		 System.out.println("x2 large battleships (3 tiles long\n");

		 System.out.println("To fire a missile at one of the tiles, choose a position on the grid.\n");

		 

		 int numOfTurnsTaken = 0;

		 

		 do {

		 

		 numOfTurnsTaken++;

		 

		 int x = 10;

		 

		 while (x < 0 || x > gridSize - 1) {

		 System.out.print("x-coordinate (horizontal axis): ");

		 x = sc.nextInt();

		 }

		 

		 int y = 10;

		 

		 while (y < 0 || y > gridSize - 1) {

		 System.out.print("y-coordinate (vertical axis): ");

		 y = sc.nextInt();

		 }

		 

		 int[] shipXCoords = {

		 ship1.x1, 

		 ship1.x2, 

		 ship2.x1, 

		 ship2.x2, 

		 ship2.x3, 

		 ship3.x1, 

		 ship3.x2,

		 ship3.x3

		 };

		 

		 int[] shipYCoords = {

		 ship1.y1, 

		 ship1.y2, 

		 ship2.y1, 

		 ship2.y2, 

		 ship2.y3, 

		 ship3.y1, 

		 ship3.y2,

		 ship3.y3,

		 };

		 

		 boolean hitShip = false;

		 

		 for (int i = 0; i < shipXCoords.length; i++) {

		 // Keeping track of ship object during for loop

		 Battleship ship;

		 if (i < 2) {

		 ship = ship1;

		 } else if (i < 5) {

		 ship = ship2;

		 } else {

		 ship = ship3;

		 }

		 

		 if (x == shipXCoords[i]) {

		 if (y == shipYCoords[i]) {

		 

		 // Update grid with damaged marker

		 grid.update(shipXCoords[i], shipYCoords[i], '!');

		 hitShip = true;

		 

		 // Record ship damage

		 ship.status = "damaged";

		 ship.damageCounter++;

		 

		 // Check if ship is destroyed

		 if (ship.damageCounter >= ship.length) {

		 ship.status = "destroyed";

		 

		 // Update grid with destroyed markers

		 grid.update(ship.x1, ship.y1, 'x');

		 grid.update(ship.x2, ship.y2, 'x');

		 if (ship.length == 3) {

		 grid.update(ship.x3, ship.y3, 'x');

		 }

		 

		 System.out.println();

		 System.out.println("A battleship was destroyed!");

		 

		 } else {

		 

		 System.out.println();

		 System.out.println("A battleship was damaged!");

		 }

		 

		 break;

		 }

		 }

		 }

		 

		 if (hitShip == false) {

		 grid.update(x, y, ' ');

		 System.out.println();

		 System.out.println("No hit. Try another tile.");

		 }

		 

		 System.out.println();

		 System.out.print(grid.grid);

		 System.out.println();

		 

		 } while (ship1.status != "destroyed" || ship2.status != "destroyed" || ship3.status != "destroyed");

		 

		 sc.close();

		 

		 System.out.println("Victory! You destroyed all battleships!");

		 System.out.println("You took " + numOfTurnsTaken + " turns to beat the game.");



	}

}
