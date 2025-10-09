package footyPrac;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.playerName = "Salah";
        p1.playerPosition = "RW";
        p1.noOfGoals = 1;
        p1.fitnessLevel = 70;   // start here
        p1.isInjured = false;

        // Train twice
        p1.train();  // 80, "did not train enough"
        p1.train();  // 90, "was amazing"

        // Play a match where he scores 2
        p1.playMatch(2); // goals = 3, fitness = 70

        // Play another match where he scores 1
        p1.playMatch(1); // goals = 4, fitness = 50

        System.out.println(p1.getStatus());
        //
    }
}
