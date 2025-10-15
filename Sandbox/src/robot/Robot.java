package robot;

public class Robot {
	//The robot lives on a grid, whose top row has y=0
	int x = 2;
	int y = 1;
	
	public boolean moveUp(int distance) {
		if (distance >= 1) {
			//check that moving won't go above the grid (0-4)
			if (y - distance >=0) {
				y = y- distance; //Basically saying that if the value of y-distance > 0 we can move up as there is space in the grid
				return true; 
			}
			
		}
		return false;
	}
	public boolean moveDown(int distance) {
		if (distance >= 1) {
			//Neither x nor y should be set to a value that is less than 0 or "greater than 4."
			if (y + distance <= 4) {
				y = y + distance;
				return true;
			}
		}
		return false;
		
	}
	public boolean moveLeft(int distance) {
		//decrease x only if x<=0
		if (distance >=1) {
			if (x - distance >= 0) {
				x = x - distance;
				return true;
			}
		}
		return false;
	}
	public boolean moveRight(int distance) {
		// void has been changed to boolean, This means that a boolean (true or false) must be returned by this method under all circumstances.
		//Increase x only if x + distance is still less than 4 meaning there is still more space to move
		if (distance > 0) { // so if distance is not >0 execution will jump directly to return false;
			if (x + distance<=4) {
				x = x + distance;
				return true;
			}
		}
		return false;
		
		
	}
	
}
