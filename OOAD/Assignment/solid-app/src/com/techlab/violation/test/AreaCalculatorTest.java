package com.techlab.violation.test;

import com.techlab.ocpviolation.*;

public class AreaCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle(4.5, 7.4);
		Circle c = new Circle(8.3);
		AreaCalculator t = new AreaCalculator();
		
		System.out.println("Rectangle: " + t.caluclateArea(r));
		System.out.println("Circle: " + t.caluclateArea(c));
	}

}
