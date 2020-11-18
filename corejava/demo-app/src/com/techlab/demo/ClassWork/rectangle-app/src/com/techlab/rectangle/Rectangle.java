package com.techlab.rectangle;

public class Rectangle {

	private float length;
	private float breadth;
	private String color;
	
	final String COLOR_1 = "red", COLOR_2 = "black", COLOR_3 = "green";	 
	final float ONE = 1.0f, HUNDRED = 100.0f;

	public void setLength(float setLength) {

		if (setLength > ONE && setLength < HUNDRED) {
			length = setLength;
		} else {
			if (setLength < ONE) {
				length = ONE;
			} else {
				length = HUNDRED;
			}
		}
	}

	public void setBreadth(float setBreadth) {
		if (setBreadth > ONE && setBreadth < HUNDRED) {
			breadth = setBreadth;
		} else {
			if (setBreadth < ONE) {
				breadth = ONE;
			} else {
				breadth = HUNDRED;
			}
		}
	}

	public void setColor(String setColor) {
		if(setColor.equals(COLOR_1) || setColor.equals(COLOR_2) || setColor.equals(COLOR_3)) {
			color = setColor;
		} else {
			color = "black";
		}
	}
	
	public float getLength() {
		return length;
	}

	public float getBreadth() {
		return breadth;
	}

	public String getColor() {
		return color;
	}
	
	public float calculateArea() {
		return length * breadth;		
	}
	
	public float calculatePerimeter() {
		return (2 * (length + breadth));
	}

}
