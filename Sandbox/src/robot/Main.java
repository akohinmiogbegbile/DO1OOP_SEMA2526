package robot;

public class Main {

    public static void main(String[] args) {
        Robot r = new Robot();

        // Starting position: (2, 1)
        System.out.println("(" + r.x + ", " + r.y + ")");

        
        r.moveUp(1);   
        System.out.println("(" + r.x + ", " + r.y + ")");

        r.moveUp(2);   
        System.out.println("(" + r.x + ", " + r.y + ")");

        r.moveRight(2); 
        System.out.println("(" + r.x + ", " + r.y + ")");

        r.moveRight(1); 
        System.out.println("(" + r.x + ", " + r.y + ")");

        r.moveDown(3);  
        System.out.println("(" + r.x + ", " + r.y + ")");
    }
}
