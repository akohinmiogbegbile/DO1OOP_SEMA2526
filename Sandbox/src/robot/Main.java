package robot;

public class Main {

    public static void main(String[] args) {
        Robot r = new Robot();

        // Starting position: (2, 1)
        System.out.println("(" + r.x + ", " + r.y + ")");

        boolean isMoveValid =
        	    r.moveRight(1) &&
        	    r.moveUp(1) &&
        	    r.moveDown(2) &&
        	    r.moveLeft(1);

        	if (isMoveValid) {
        	    System.out.println("(" + r.x + ", " + r.y + ")");
        	} else {
        	    System.out.println("Invalid Move");
        	}

  }
} 
