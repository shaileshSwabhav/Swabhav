package com.techlab.rectangle.test;

import com.techlab.rectangle.*;

public class RectangleArrayOfObject {

	public static void main(String[] args) {

		Rectangle[] r = new Rectangle[3];

		r[0] = new Rectangle();
		r[0].setLength(15.6f);
		r[0].setBreadth(19.9f);

		Rectangle r1 = new Rectangle();
		r1.setLength(16.4f);
		r1.setBreadth(11.4f);

		Rectangle r2 = new Rectangle();
		r2.setLength(1.4f);
		r2.setBreadth(8.4f);

		r[1] = r1;
		r[2] = r2;

		printInfo(r);
//		System.out.println("Smallest Area: " + findSmallArea(r));
		Rectangle result = findSmallArea(r);
		float x = result.calculateArea();
		System.out.println("Smallest Area: " + result.calculateArea());

//		System.out.println("Big Perimeter: " + findBigPerimeter(r));
//		Rectangle result = findBigPerimeter(r);
//		System.out.println("Big Perimeter: " + result.calculatePerimeter());

	}

	public static void printInfo(Rectangle[] r) {

		for (int i = 0; i < r.length; i++) {
//			System.out.println("HashCode: " + r[i].hashCode());
			System.out.println("Length: " + r[i].getLength());
			System.out.println("Breadth: " + r[i].getBreadth());
			System.out.println("Area: " + r[i].calculateArea());
			System.out.println("Perimeter: " + r[i].calculatePerimeter());
			System.out.println();

		}

	}

//	public static float findSmallArea(Rectangle[] r) {
//
//		float result = r[0].calculateArea();
//		for (int i = 1; i < r.length; i++) {
//			if (result > r[i].calculateArea()) {
//				result = r[i].calculateArea();
//			}
//		}
//		return result;
//	}

	public static Rectangle findSmallArea(Rectangle[] r) {

		Rectangle rect = r[0];
		float result = r[0].calculateArea();
		for (int i = 1; i < r.length; i++) {
			if (result > r[i].calculateArea()) {
				result = r[i].calculateArea();
				rect = r[i];
			}
		}
		return rect;

	}

//	public static float findBigPerimeter(Rectangle [] r) {
//		
//		float result = r[0].calculatePerimeter();
//		for (int i = 0; i < r.length-1; i++) {
//			if (r[i].calculatePerimeter() > r[i+1].calculatePerimeter()) {
//				result = r[i].calculatePerimeter();
//			} else {
//				result = r[i+1].calculatePerimeter();
//			}
//		}
//		return result;	
//	}

//	public static Rectangle findBigPerimeter(Rectangle[] r) {
//
//		Rectangle rect = r[0];
//		float result = r[0].calculateArea();
//
//		for (int i = 1; i < r.length; i++) {
//			if (result < r[i].calculatePerimeter()) {
//				rect = r[i];
//			}
//		}
//		return rect;
//
//	}

}
