package com.techlab.dipsolution;

public class Shelf {

	IProductable product;
	
	public void addProductToShelf(IProductable product) {
		this.product = product;
	}
	
	public void customizeShelf() {
		System.out.println("Shelf Customized");
	}
	
}

// so here instead of having book or dvd ref we are having a interface ref
// this brings the abstraction 
// and we can add any new product to the shelf without modifying the existing classes