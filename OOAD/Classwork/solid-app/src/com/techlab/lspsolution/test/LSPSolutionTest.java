package com.techlab.lspsolution.test;

import com.techlab.lspsolution.*;

public class LSPSolutionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle(4, 6);
		Square s = new Square(5);

		checkShape(r);
		checkShape(s);
		
	}
	
	public static void checkShape(Rectangle r) {		
		System.out.println("Area of Rectangle: " + r.calculateArea());
	}

	public static void checkShape(Square s) {	
		System.out.println("Area of square: " + s.calculateArea());
	}
	
}
