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
    
    public void playMatch(int goalsScored) {
    	//Play a match: add goals, reduce fitness, track the possibility of getting injured
    	//This is at the top of the method because there is no point running the full code when the player is injured
    	//The return there basically tells the program if the player is injured don't bother doing the rest of the method 
    	//which is why its best practice to start with any liabilities
    	//The stuff in the bracket is a "Parameter" which provides data to method 
 
    	if (isInjured) {
    		System.out.println(playerName + " cannot play today because they are injured");
    		return;
    	}
    	
    	//To update the number of goals each player scores
    	noOfGoals = noOfGoals + goalsScored;
    	
    	//reduce fitness levels by 20 for the match
    	fitnessLevel = fitnessLevel - 20;
    	
    	// injury rule: below 30 => injured
        if (fitnessLevel < 30) {
            isInjured = true;
            System.out.println(playerName + " played and scored " + goalsScored + " goal(s), but got injured. Fitness: " + fitnessLevel);
        } else {
            System.out.println(playerName + " played and scored " + goalsScored + " goal(s). Fitness now: " + fitnessLevel);
        }
    }

    // Quick status string (return example)
    //Printing all player Info
    //y
    public String getStatus() {
        return playerName + " (" + playerPosition + ") - Goals: " + noOfGoals + ", Fitness: " + fitnessLevel + ", Injured: " + isInjured;
    }
    		
   }
