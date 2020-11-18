package com.techlab.srpsolution;

import java.util.LinkedList;

public class Inventory {
	
	// here inventory will do all the work related to search 
	// and adding the book
	
	private LinkedList<Book> books;
	
	public Inventory() {
		books = new LinkedList<Book>();
	}

	public void addBook(Book book) {
		books.add(book);
	}
	
	public Book searchBook(String bookName) {
		for(Book b: books) {
			if(b.getBookName().equalsIgnoreCase(bookName)) {
				return b;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Inventory [books=" + books + "]";
	}
}
