package libraryOfKnowledge;



public class Client extends Librarian {
	
	public static void main(String args[]) {
		Librarian c1 = new Librarian("Lord of The Ring", "J.R.R. Tolkien"); // podajemy co chcemy wypo¿yczyæ
		addToLibrary();
		
		String x1 = c1.getRecord();
		
		showLibrary();
		
		borrowBook(x1);
		
		returnBook(books.get(0));
		
		
	}
}
