package com.techlab.dipsolution;

public class DVD implements IProductable {

	@Override
	public void seeReview() {
		System.out.println("see dvd review");
	}

	@Override
	public void getSample() {
		System.out.println("get dvd sample");
	}

}
