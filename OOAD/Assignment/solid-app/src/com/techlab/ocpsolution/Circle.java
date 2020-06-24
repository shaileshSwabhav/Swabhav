package com.techlab.ocpsolution;

public class Circle implements IShape {
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double calculateArea() {
		return (3.14 * radius * radius);
	}


}
