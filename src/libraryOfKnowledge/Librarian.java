package libraryOfKnowledge;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Iterator;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Librarian extends Library{
	
	public Librarian() {
		super();
	}
	
	public Librarian(String n, String a) {
		super(n, a);		
	}
	
	static List<String> books = new ArrayList<>();
	static List<String> movies = new ArrayList<>();
	
	public static void addToLibrary() {
		Library b1 = new Library("Lord of The Ring", "J.R.R. Tolkien");
		Library b2 = new Library("Harry Potter", "J.K. Rowling");
				
		books.add(b1.getRecord());
		books.add(b2.getRecord());
		
		Library m1 = new Library("Lord of The Rings", "Peter Jackson");
		Library m2 = new Library("Harry Potter: Kamieñ", "Chris Columbus");
				
		movies.add(m1.getRecord());
		movies.add(m2.getRecord());
	}
	
	public static String addDate() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 30);
		String dateString = dateFormat.format(calendar.getTime());
		return dateString;
	}
		
	public static void borrowBook(String name) {
		String dateString = addDate();
		int k = books.indexOf(name);
		books.set(k, "Wypo¿yczono do: "+ dateString + " " + name);
		showLibrary();
	}
	public static void returnBook(String name) {
		String dateString = addDate();
		String cutedname = name.replaceAll("(.*)Wypo¿yczono do: " + dateString,"");
		int k = books.indexOf(name);
		books.set(k, cutedname);
		showLibrary();
	}
	public static void borrowMovie(String name) {
		String dateString = addDate();
		int k = movies.indexOf(name);
		movies.set(k, "Wypo¿yczono do: " + dateString + " " + name);
		showLibrary();
		
	}
	public static void returnMovie(String name) {	
		String dateString = addDate();
		String cutedname = name.replaceAll("(.*)Wypo¿yczono do: " + dateString,"");
		int k = movies.indexOf(name);
		movies.set(k, cutedname);
		showLibrary();
	}
	public static void showLibrary() {
		System.out.println("[BIBLIOTEKA]");
		System.out.println("Ksi¹¿ki w naszej bibliotece:");
		Iterator<String> showBooks = books.iterator();
		
		while (showBooks.hasNext()) {
			System.out.print("  ");
			System.out.println(showBooks.next());			
		}System.out.println();		
		
		Iterator<String> showMovies = movies.iterator();
		
		System.out.println("Filmy w naszej bibliotece:");
		
		while (showMovies.hasNext()) {
			System.out.print("  ");
			System.out.println(showMovies.next());
		}System.out.println("[BIBLIOTEKA]");
		System.out.println();
	}
	
}
