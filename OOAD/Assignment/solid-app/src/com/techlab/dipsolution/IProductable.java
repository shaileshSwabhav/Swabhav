package com.techlab.dipsolution;

public interface IProductable {

	public void seeReview();
	public void getSample();
}

// IProductable is the abstraction layer between Shelf class and Book and DVD class
// this reduces the tight coupling that existed between them