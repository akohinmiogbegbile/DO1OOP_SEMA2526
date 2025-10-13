package school;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.credits = 40;
		
		s1.addCredits(10);
		s1.addCredits(30);
		
		
		//Output the total credits
		System.out.println("Total Credits is " + s1.credits);
	}

}
