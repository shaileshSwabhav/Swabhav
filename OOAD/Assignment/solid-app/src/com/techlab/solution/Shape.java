package com.techlab.solution;

public interface Shape {

	public double calculateArea();
	
	// having different class for shape makes it easier as 
	// all classes implementing it will override calculateArea accordingly.
	
}
