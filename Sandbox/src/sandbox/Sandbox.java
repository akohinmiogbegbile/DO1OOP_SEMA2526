package sandbox;

public class Sandbox {

	public static void main(String[] args) {
		
		//You are to write a program in Java Eclipse, using a FOR loop, to generate the 
		//multiplication tables from 1 to 5, that is 1*1, 1*2 etc up until 
		//and including the 5 times table 5*1, 5*2 etc.
		//NOTE: you will need a nested FOR loop, which means using two FOR loops.
		
		
		//Need the 2 loops to cover 2 parts of the Multiplications Table
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Multiplication Table for " + i);
			//the second loop
			
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
		}
		
		
		
		

		
	}

}
