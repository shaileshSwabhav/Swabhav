package com.techlab.solution.test;

import com.techlab.ocpsolution.*;

public class CalculateAreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IShape s1 = new Rectangle(4.5, 7.4);
		IShape s2 = new Circle(5.3);
		
		calculateArea(s1);
		calculateArea(s2);
	}
	
	public static void calculateArea(IShape s) {	
		System.out.println(s.getClass().getSimpleName() 
				+  ": " + s.calculateArea());
	}

}
