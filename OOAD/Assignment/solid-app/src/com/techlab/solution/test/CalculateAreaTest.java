package com.techlab.solution.test;

import com.techlab.solution.*;

public class CalculateAreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Rectangle(4.5, 7.4);
		Shape s2 = new Circle(5.3);
		
		s1.calculateArea();
		s2.calculateArea();
	}
	
	public static void calculateArea(Shape s) {
		
		System.out.println(s.calculateArea());
	}

}
