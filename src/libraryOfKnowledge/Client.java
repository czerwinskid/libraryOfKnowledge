package libraryOfKnowledge;



public class Client extends Librarian {
	
	public static void main(String args[]) {
		Librarian c1 = new Librarian("Lord of The Ring", "J.R.R. Tolkien");
		addToLibrary();
		
		String x = c1.getRecord();		
		
		borrowBook(x);
		
		returnBook(books.get(0));
		System.out.println(books.get(0));
		
		
	}

}
