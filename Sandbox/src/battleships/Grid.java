package battleships;

public class Grid {
	String grid = "";

	int size;

	

	// Constructor: generate grid (max 10 x 10)

	public Grid(int gridSize) {

 

 size = gridSize;

 

 if (size > 10) {

 grid = "Too large! Maximum grid size: 10 x 10";

 }

 

 // Use concatenation to build the 'grid' String variable

 for (int i = 0; i < size; i++) {

 

 // Special formatting required for first 'row'

 if (i == 0) {

 String row1 = " ";

 

 for (int j = 0; j < size ; j++) {

 row1 += " " + j;

 }

 

 grid += row1 + "\n";

 

 }

 

 // Remaining rows

 String row = "";

 row += i;

 

 for (int j = 0; j < size ; j++) {

 row += " -";

 }

 

 grid += row + "\n";

 }

	}

	

	// Method: update grid one char at a time

	public String update(int x, int y, char marker) {

 

 // Find index of specific char in the long 'grid' string based on x and y parameters

 int charIndex = (2 * x) + ((size + 1) * 2 * y) + (size * 2) + 5;

 

 // Split grid string and reconstruct to replace char with marker parameter

 String gridSect1 = grid.substring(0, charIndex - 1);	

 String gridSect2 = grid.substring(charIndex, grid.length());

 

 grid = gridSect1 + marker + gridSect2;

 

 return grid;

	}
}
