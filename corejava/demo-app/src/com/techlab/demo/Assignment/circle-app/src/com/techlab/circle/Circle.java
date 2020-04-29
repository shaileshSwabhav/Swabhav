package com.techlab.circle;

public class Circle {

	private float radius;
	private String color;
	final String PINK = "pink", GREY = "grey", PURPLE = "purple";
	final double PI = 3.14;

	public void setRadius(float setRadius) {

		if (setRadius > 0) {
			radius = setRadius;
		} else {
			radius = 1.0f;
		}
	}

	public void setColor(String setColor) {

		if ((setColor.toLowerCase()).equals(PINK) || (setColor.toLowerCase()).equals(GREY)
				|| (setColor.toLowerCase()).equals(PURPLE)) {
			
			color = setColor;
		} else {
			color = "pink";
		}
	}
	
	public float getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}
	
	public double calculateArea() {	
		return PI * radius * radius;
	}
	
	public double calculatePerimeter() {
		return 2 * PI * radius;
	}
	
	
	
}
