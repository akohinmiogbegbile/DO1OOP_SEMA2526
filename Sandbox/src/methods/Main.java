package methods;

public class Main {

	public static void main(String[] args) {
		//we are trying to move the position of a player
		//A new player object called p1
		Player p1 = new Player();
		//The initial position of the player object is set to 3
		p1.position = 4;
		//Then the move method which we created in the player class is called twice
		p1.back();
		p1.move();
		
		
		
		//This should then output 5 since the move method simply adds 1 to the initial position
		//System.out.print(p1.position);
		
	}

}
