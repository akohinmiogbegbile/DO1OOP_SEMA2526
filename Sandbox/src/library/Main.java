package library;

public class Main {
	public static void main(String[] args) {
		Book b1 = new Book("You have a Brain", "Ben Carson", 2014);
		
		System.out.println("Title: " + b1.getTitle());
		System.out.println("Author: " + b1.getAuthor());
		System.out.println("Year: " + b1.getYear());
		
		//Or to be more efficient...
		System.out.println("\nUsing displayDetails():");
        b1.displayDetails();
        //Task Test
        //This will not work as it's trying to access a private attribute directly
        //System.out.println(b1.title);
        
	}
}
