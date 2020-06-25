package com.techlab.dipviolation;

public class Shelf {

	Books book;
	
	void addBook(Books book) {
		this.book = book;
	}
	
	void customizeShelf() {
		System.out.println("Shelf customized");
	}
}
