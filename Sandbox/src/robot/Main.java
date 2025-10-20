package robot;

public class Main {
    public static void main(String[] args) {
        // Create robots
        Robot r1 = new Robot(2, 3); // custom position
        Robot r2 = new Robot();     // default position (2,1)

        // Move them
        r1.moveUp(1);
        r2.moveRight(2);

        // Print final positions
        System.out.println("Robot 1: (" + r1.getX() + ", " + r1.getY() + ")");
        System.out.println("Robot 2: (" + r2.getX() + ", " + r2.getY() + ")");
    }
}
