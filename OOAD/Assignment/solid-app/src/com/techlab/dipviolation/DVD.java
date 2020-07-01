package com.techlab.dipviolation;

public class DVD {

	public void seeReview() {
		System.out.println("See DVD Reviews");
	}

	public void watchSample() {
		System.out.println("Watching DVD sample");
	}
}

// now we need to add this to the shelf
// we can't do that bcoz it will violate OCP has we will end up modifying shelf class
// so we need to have a abstract(interface) class 
// which we help us to add book and DVD to the shelf