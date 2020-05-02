package com.techlab.circle;

public class Circle {

	private float radius;
	private String color;
	private final String IS_PINK = "pink", IS_GREY = "grey", IS_PURPLE = "purple";
	// insatance variable
	// color identify karna tha so i named them there color name
	// ok
	// change naming convention ok
	private final double PI = 3.14;

	public void setRadius(float setRadius) {

		if (setRadius > 0) {
			radius = setRadius;
		} else {
			radius = 1.0f;
		}
	}

	public void setColor(String setColor) {

//		if ((setColor.toLowerCase()).equals(IS_PINK) || (setColor.toLowerCase()).equals(IS_GREY)
//				|| (setColor.toLowerCase()).equals(IS_PURPLE)) {
//			
//			color = setColor;
//		} else {
//			color = "pink";
//		}
		
		// ternary operator
		color = (setColor.toLowerCase()).equals(IS_PINK) ? (setColor)
				: ((setColor.toLowerCase()).equals(IS_GREY) ? (setColor)
						: ((setColor.toLowerCase()).equals(IS_PURPLE) ? (setColor) : IS_PINK));
	
	}

	// check if we can do it with ternary operator
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
