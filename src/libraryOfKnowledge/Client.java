package libraryOfKnowledge;

import java.util.Iterator;

public class Client extends Librarian {
	
	public static void main(String args[]) {
		Librarian c1 = new Librarian("Lord of The Ring", "Tolkien");
		addToLibrary();
		
		String x = c1.getRecord();		
		
		borrowBook(x);
		
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
		
		returnBook(books.get(0));
		System.out.println(books.get(0));
	}

}
