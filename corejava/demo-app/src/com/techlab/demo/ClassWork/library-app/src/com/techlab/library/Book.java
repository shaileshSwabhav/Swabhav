package com.techlab.library;

public class Book {
	
	private String bookName, author;
	
	public Book() {
		
	}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public String getAuthor() {
		return author;
	}

}
