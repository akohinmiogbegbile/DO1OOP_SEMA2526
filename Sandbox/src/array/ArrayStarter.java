package array;

public class ArrayStarter {

	public static void main(String[] args) {
		
		// a new array is populated with twelve integers showing monthly rainfall in mm in Birmingham
		// the first figure is for January, the second is for February, and so on
		int numbers[] = { 72, 55, 51, 57, 61, 68, 66, 68, 68, 81, 79, 84 };
		
		// Array of months 
		String months [] = {"January","February", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"};
		// a loop enables the output of each of those values in turn
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(months[i] + ": " + numbers[i] + "mm");
		}

	}

}
