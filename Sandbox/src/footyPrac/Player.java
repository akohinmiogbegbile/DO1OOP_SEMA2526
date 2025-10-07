package footyPrac;

public class Player {
    String playerName;
    String playerPosition;
    int noOfGoals;
    int fitnessLevel;
    boolean isInjured;

    public void train() {
        // Increase fitness first
        fitnessLevel = fitnessLevel + 10;
        if (fitnessLevel > 100) {
            fitnessLevel = 100; // cap it at 100
        }

        // Then check the new fitness level and print messages
        if (fitnessLevel < 90) {
            System.out.println(playerName + " had a fitness level of " + fitnessLevel + " and did not train enough today.");
        } else if (fitnessLevel >= 90 && fitnessLevel < 100) {
            System.out.println(playerName + " had a fitness level of " + fitnessLevel + " and was amazing today!");
        } else {
            System.out.println(playerName + " is already at peak fitness!");
        }
    }

}
