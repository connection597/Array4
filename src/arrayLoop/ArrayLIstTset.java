package arrayLoop;

import java.awt.print.Book;
import java.util.ArrayList;

public class ArrayLIstTset {

	public static void mainBooking(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book());
		library.add(new Book());
		library.add(new Book());
		library.add(new Book());
		library.add(new Book());
		
		for(int i =0; i<library.size(); i++) {
			Book book = library.get(i);
		    
		}
		System.out.println();
		
		System.out.println("===향상된 for문 사용===");
		for(Book book : library) {
			
			
		}
	}

}
