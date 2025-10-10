package robot;

public class Robot {
	//The robot lives on a grid, whose top row has y=0
	int x = 2;
	int y = 1;
	
	public void moveUp() {
		// This basically means only move up if not already in the top row
		if (y>0) {
			y = y-1; // means move one row upward
		}
	}
	public void moveDown() {
		if (y<2) {
			y = y+1;
		}
	}
	public void moveLeft() {
		if (x>0) {
			x = x-1;
		}
	}
	public void moveRight() {
		if (x<2) {
			x = x+1;
		}
	}
	
}
