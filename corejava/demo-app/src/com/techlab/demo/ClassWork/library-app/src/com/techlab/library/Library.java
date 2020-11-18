package com.techlab.library;

public class Library {
	
	private Book [] book;
	
	public Library(Book [] b) {
		this.book = b;
	}
	
	public Book[] getAllBooks() {
		return book;
	}

}
