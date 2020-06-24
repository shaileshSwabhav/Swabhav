package com.techlab.ocpsolution;

public interface IShape {

	public double calculateArea();
	
	// having different class for shape makes it easier as 
	// all classes implementing it will override 
	// calculateArea accordingly.
	
}
