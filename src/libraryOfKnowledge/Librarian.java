package libraryOfKnowledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Librarian extends Library{
	public static void main(String args[]) {
		
		List<String> books = new ArrayList<>();
		Library l1 = new Library("Lord of The Ring", "Tolkien");
		Library l2 = new Library("Harry Potter", "J.K. Rowling");
				
		books.add(l1.getBook());
		books.add(l2.getBook());

		Iterator show = books.iterator();
		int i = 0;
		
		while (show.hasNext()) {
			System.out.println(show.next());
		}
		
		
		
		
	}
	
}
