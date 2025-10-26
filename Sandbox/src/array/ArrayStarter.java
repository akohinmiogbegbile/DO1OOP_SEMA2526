package array;

public class ArrayStarter {
    public static void main(String[] args) {

        // Monthly rainfall (mm) for Birmingham: index 0 = January, 11 = December
        int[] rainfall = { 72, 55, 51, 57, 61, 68, 66, 68, 68, 81, 79, 84 };

        // Month names aligned to the same indices as 'rainfall'
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        //Print values in REVERSE order (Dec to Jan)
        System.out.println("1) Rainfall in reverse order (values only):");
        for (int i = rainfall.length - 1; i >= 0; i--) {
            System.out.println(rainfall[i]);
        }
        System.out.println();

        //Keep the same loop idea, but only output values > 65 (with month names for clarity)
        System.out.println("2) Months with rainfall > 65mm:");
        for (int i = 0; i < rainfall.length; i++) {
            if (rainfall[i] > 65) {
                System.out.println(months[i] + ": " + rainfall[i] + "mm");
            }
        }
        System.out.println();

        //Output month names with their values (Jan to Dec)
        System.out.println("3) All months with rainfall:");
        for (int i = 0; i < rainfall.length; i++) {
            System.out.println(months[i] + ": " + rainfall[i] + "mm");
        }
        System.out.println();

        //Total rainfall for the year
        int total = 0;
        for (int i = 0; i < rainfall.length; i++) {
            total += rainfall[i];
        }
        System.out.println("4) Total rainfall for the year: " + total + "mm");
        System.out.println();

        //Month with the highest rainfall (track value + index)
        int maxRain = rainfall[0];
        int maxIndex = 0;
        for (int i = 1; i < rainfall.length; i++) {
            if (rainfall[i] > maxRain) {
                maxRain = rainfall[i];
                maxIndex = i;
            }
        }
        System.out.println("5) Highest rainfall: " + months[maxIndex] + " (" + maxRain + "mm)");
        System.out.println();

        //Average rainfall
        double average = (double) total / rainfall.length;
        System.out.println("6) Average rainfall: " + average + "mm");
        System.out.println();

        //Count months above average
        int aboveAvgCount = 0;
        for (int i = 0; i < rainfall.length; i++) {
            if (rainfall[i] > average) {
                aboveAvgCount++;
            }
        }
        System.out.println("7) Number of months above average: " + aboveAvgCount);
        System.out.println();

        //List the months that are above average
        System.out.println("8) Months with above-average rainfall:");
        for (int i = 0; i < rainfall.length; i++) {
            if (rainfall[i] > average) {
                System.out.println(months[i] + " (" + rainfall[i] + "mm)");
            }
        }
    }
}
