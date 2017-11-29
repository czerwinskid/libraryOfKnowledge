package libraryOfKnowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Librarian extends Library{
	
	public Librarian() {
		super();
	}
	
	public Librarian(String n, String a) {
		super(n, a);		
	}
	
	static List<String> books = new ArrayList<>();
	static List<String> movies = new ArrayList<>();
	
		public static void main(String args[]) {
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
		
		public static void borrowBook(String name) {
			int k = books.indexOf(name);
			books.set(k, "Wypo¿yczono: " + name);
		}
		public void returnBook(String name) {
			int k = books.indexOf(name);
			books.set(k, name);
		}
		public void borrowMovie(String name) {
			int k = books.indexOf(name);
			movies.set(k, "Wypo¿yczono: " + name);
		}
		public void returnMovie(String name) {
			int k = books.indexOf(name);
			movies.set(k, name);
		}
	
}
