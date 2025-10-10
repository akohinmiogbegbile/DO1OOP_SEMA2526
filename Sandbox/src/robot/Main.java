package robot;

public class Main {

	public static void main(String[] args) {
		//Controlling the behaviour of a robot that moves around a grid system. 
		
		Robot r = new Robot();
		r.moveUp();
		System.out.println("(" + r.x + "," + r.y + ")");
		
		r.moveDown();
		System.out.println("(" + r.x + "," + r.y + ")");
		
		r.moveLeft();
		System.out.println("(" + r.x + "," + r.y + ")");
		
		r.moveRight();
		System.out.println("(" + r.x + "," + r.y + ")");

	}

}
