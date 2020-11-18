package com.techlab.dipsolution;

public class Book implements IProductable {

	@Override
	public void seeReview() {
		System.out.println("see book review");
	}

	@Override
	public void getSample() {
		System.out.println("get book sample");
	}

}

// Book is a product so it implements IProductable interface