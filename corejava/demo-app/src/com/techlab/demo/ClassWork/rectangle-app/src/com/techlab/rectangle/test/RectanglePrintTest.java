package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectanglePrintTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		
		r1.setLength(12.4f);
		r1.setBreadth(22.5f);
		r1.setColor("green");
		
		r2.setLength(6.4f);
		r2.setBreadth(11.7f);
		r2.setColor("black");
		
		System.out.println(r1.hashCode());
		System.out.println(r2.hashCode());

		//printRectangle(r1);
		printRectangleInfo(r1);

		
		printRectangleInfo(r2);
		
	}
	
	public static void printRectangle(Rectangle r) {
		System.out.println("Rectangle info is:-");
		System.out.println("Length: " +r.getLength());
		System.out.println("Breadth: " +r.getBreadth());
		System.out.println("Color: " +r.getColor());
		System.out.println("Area: " +r.calculateArea());

	}
	
	public static void printRectangleInfo(Rectangle r) {
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1.getLength());
		System.out.println(r.getBreadth());
		System.out.println(r.getColor());
		System.out.println(r.calculateArea());
		System.out.println(r.hashCode());
	}

}
