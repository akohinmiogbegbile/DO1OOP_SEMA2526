package library;

public class Book {
	//Task
	//To consolidate your learning about constructors and access modifiers, now try out the following:

	//	Create the Book class in full, using private attributes and public methods.
	//	Add a constructor, with parameters, to set the attributes of a book.
	//	Display the details of a book by calling methods instead of accessing attributes.
	//	See what happens if you try to access a private attribute.
	
	//private attributes where only this class can access them
	private String title;
	private String author;
	private int year;
	
	//Constructors which runs when you make a new book object
	public Book (String newTitle, String newAuthor, int newYear) {
		title = newTitle;
		author = newAuthor;
		year = newYear;
	}
	
	//Public methods, a safe way to read private attributes
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYear() {
		return year;
	}
	//A method to display all info
	public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}
