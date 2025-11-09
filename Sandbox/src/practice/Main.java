package practice;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Inmi");
		names.add("David");
		names.add("Ronnie");
		names.add("Emma");
		System.out.println(names.set(1, "John"));
		System.out.println(names.get(1));
		System.out.println(names.remove(0));
		System.out.println(names.get(0));
		System.out.println(names.size());
		//System.out.println(names.(1));
		
		

	}

}