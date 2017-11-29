package libraryOfKnowledge;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String name;
	private String author;
	private String together;
	
	private List<String> books = new ArrayList<>();
	private List<String> movies = new ArrayList<>();
	
	Library(String n, String a) {
		name = n;
		author = a;
	}
	
	Library(String t){
		t = name + " " + author;
		together = t;
	}
	
	void setName(String n) {
		name = n;
	}
	void setAuthor(String a) {
		author = a;
	}	
	void addBook(String t) {
		t = together;
		books.add(t);
	}
	void addMovie(String t) {
		t = together;
		movies.add(t);
	}
	void getBooks(String t) {
		t = together;
		books.remove(t);
	}
	void getMovies(String t) {
		t = together;
		movies.remove(t);
	}

}
