package libraryOfKnowledge;

public class Library {
	private String name;
	private String author;
	
	public Library() {
		name = null;
		author = null;
	}
	
	public Library(String n, String a) {
		name = n;
		author = a;		
	}
	
	void setName(String n) {
		name = n;
	}
	void setAuthor(String a) {
		author = a;
	}
	String getBook() {
		return "Nazwa: " + name + ", Autor: " + author;
	}
	String getMovie() {
		return "Nazwa: " + name + ", Autor: " + author;
	}

}


