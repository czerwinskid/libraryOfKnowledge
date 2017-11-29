package libraryOfKnowledge;

public class Client extends Librarian {
	
	public static void main(String args[]) {
		Librarian c1 = new Librarian("Lord of The Ring", "Tolkien");
		addToLibrary();
		
		String x = c1.getBook();
		System.out.println(x);
		
		borrowBook(x);
	}

}
