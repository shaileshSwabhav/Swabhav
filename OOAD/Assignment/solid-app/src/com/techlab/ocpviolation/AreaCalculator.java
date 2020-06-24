package com.techlab.ocpviolation;

public class AreaCalculator {
	
	public double caluclateArea(Rectangle rect) {
		return rect.getLength() * rect.getWidth();
	}
	
	public double caluclateArea(Circle circle) {
		return (3.14 * circle.getRadius() * circle.getRadius());
	}
	
	// this is not good becoz we cannot override the method every time user has new shape
	// instead we should have a interface class which will define the calculateArea method accordingly.

}
