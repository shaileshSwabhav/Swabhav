package com.techlab.circle.test;

import com.techlab.circle.*;

public class CircleArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle [] c = new Circle[3];
		
		c[0] = new Circle();
		c[0].setRadius(12.4f);
		c[0].setColor("Purple");
		
		Circle c1 = new Circle();
		c1.setRadius(15.2f);
		c1.setColor("red");
		
		Circle c2 = new Circle();
		c2.setRadius(18.2f);
		c2.setColor("grey");
		
		c[1] = c1;
		c[2] = c2;
		
		printInfo(c);
		
		System.out.println("Smallest Area: " + findSmallArea(c));
		
//		Circle result = findSmallArea(c);
//		System.out.println("Small Area: " + result.calculateArea());
		
		System.out.println("Big Perimeter: " + findBigPerimeter(c));
		
//		Circle result = findBigPerimeter(c);
//		System.out.println("Big Perimeter: " + result.calculatePerimeter());

		
	}

	public static void printInfo(Circle [] c) {

		for (int i = 0; i < c.length; i++) {
			System.out.println("Radius: " + c[i].getRadius());
			System.out.println("Color: " + c[i].getColor());
			System.out.println("Area: " + c[i].calculateArea());
			System.out.println("Perimeter: " + c[i].calculatePerimeter());
			System.out.println();
		}
		
	}
	
	public static float findSmallArea(Circle [] c) {
		
		float result = (float) c[0].calculateArea();
		for (int i = 1; i < c.length; i++) {
			if (result > c[i].calculateArea()) {
				result = (float) c[i].calculateArea();
			}
		}
		return result;
		
	}
	
//	public static Circle findSmallArea(Circle [] c) {
//		
//		float result = (float) c[0].calculateArea();
//		Circle circle = new Circle();
//		for (int i = 1; i < c.length-1; i++) {
//			if (result > c[i].calculateArea()) {
//				circle = c[i];
//			} 
//		}
//		return circle;
//		
//	}
	
	public static float findBigPerimeter(Circle[] c) {
		
		float result = (float) c[0].calculatePerimeter();

		for (int i = 1; i < c.length; i++) {
			if (result < c[i].calculatePerimeter()) {
				result = (float) c[i].calculatePerimeter();
			}
		}
		return result;
	}
	
//	public static Circle findBigPerimeter(Circle[] c) {
//		
//		Circle circle = new Circle();
//		float result = (float) c[0].calculatePerimeter();
//
//		for (int i = 1; i < c.length; i++) {
//			if (result < c[i].calculatePerimeter()) {
//				circle = c[i];
//			}
//		}
//		return circle;
//	}

}
