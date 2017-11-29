package libraryOfKnowledge;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String name;
	private String author;
	
	private List<String> ksiazki = new ArrayList<String>();
	private List<String> filmy = new ArrayList<String>();
	
	Library() {
		
	}
	
	Library(String n, String a) {
		name = n;
		author = a;
	}
	
	String getName() { return name; }
	String getAuthor() { return author; }
	void setName(String n) { name = n; }
	void setAuthor(String a) { author = a; }

}
