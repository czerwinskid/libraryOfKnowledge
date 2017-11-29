package libraryOfKnowledge;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String name;
	private String author;
	private String together;
	
	private List<String> books = new ArrayList<>();
	private List<String> movies = new ArrayList<>();
	
	public Library(){
		
	}
	public Library(String n, String a) {
		name = n;
		author = a;
	}
	
	public Library(String t){
		t = name + " " + author;
		together = t;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setAuthor(String a) {
		author = a;
	}	
	public void addBook(String t) {
		t = together;
		books.add(t);
	}
	public void addMovie(String t) {
		t = together;
		movies.add(t);
	}
	public void deleteBooks(String t) {
		t = together;
		books.remove(t);
	}
	public void deleteMovies(String t) {
		t = together;
		movies.remove(t);
	}
	
	public void showBooks(String book) {
		book = together;
		int s = books.indexOf(book);
		System.out.println(s);
	}

}
