package libraryOfKnowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Librarian extends Library{
	public static void main(String args[]) {
		List<String> books = new ArrayList<>();
		Library b1 = new Library("Lord of The Ring", "Tolkien");
		Library b2 = new Library("Harry Potter", "J.K. Rowling");
				
		books.add(b1.getBook());
		books.add(b2.getBook());
		
		Iterator<String> showBooks = books.iterator();
		
		System.out.println("Ksi¹¿ki w naszej bibliotece:");
		
		while (showBooks.hasNext()) {
			System.out.print("  ");
			System.out.println(showBooks.next());			
		}System.out.println();

		List<String> movies = new ArrayList<>();
		
		Library m1 = new Library("Lord of The Rings", "Peter Jackson");
		Library m2 = new Library("Harry Potter: Kamieñ", "Chris Columbus");
				
		movies.add(m1.getBook());
		movies.add(m2.getBook());

		Iterator<String> showMovies = movies.iterator();
		
		System.out.println("Filmy w naszej bibliotece:");
		
		while (showMovies.hasNext()) {
			System.out.print("  ");
			System.out.println(showMovies.next());
		}System.out.println();
		
	}
	public void borrowBook() {
		
	}
	public void returnBook() {
		
	}
	public void borrowMovie() {
		
	}
	public void returnMovie() {
		
	}
	
}
