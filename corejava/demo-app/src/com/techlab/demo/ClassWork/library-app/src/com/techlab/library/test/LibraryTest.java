package com.techlab.library.test;

import com.techlab.library.*;

public class LibraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book [] b = new Book[3];
		b[0] = new Book("abc", "sam");
		b[1] = new Book("mno", "ben");
		b[2] = new Book("xyz", "tom");
		
		Library library = new Library(b);
		
		Book [] books = library.getAllBooks();

		for(Book book: books) {
			System.out.println("Book Name: " + book.getBookName() + " By " + book.getAuthor());
		}
		
	}

}
