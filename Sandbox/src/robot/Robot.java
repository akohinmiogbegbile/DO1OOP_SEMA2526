package robot;

public class Robot {
	//The robot lives on a grid, whose top row has y=0
	int x = 2;
	int y = 1;
	
	public void moveUp(int distance) {
		if (distance >= 1) {
			//check that moving won't go above the grid (0-4)
			if (y - distance >=0) {
				y = y- distance; //Basically saying that if the value of y-distance > 0 we can move up as there is space in the grid
			}
			
		}
	}
	public void moveDown(int distance) {
		if (distance >= 1) {
			//Neither x nor y should be set to a value that is less than 0 or "greater than 4."
			if (y + distance <= 4) {
				y = y + distance;
			}
		}
		
	}
	public void moveLeft(int distance) {
		//decrease x only if x<=0
		if (distance >= 1) {
			if (x - distance <= 0) {
				x = x - distance;
			}
		}
	}
	public void moveRight(int distance) {
		//Increase x only if x <=4
		if (distance >=1) {
			if (x + distance<=4) {
				x = x + distance;
			}
		}
		
		
	}
	
}
