package com.techlab.circletest;
import com.techlab.circle.*;

public class CirclePrintTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle();
		
		c.setRadius(10.5f);
		c.setColor("gReY");
		
		
		printCircle(c);
		//yes
		//call all getters and calculate area through object 
		
	}

	public static void printCircle(Circle c) {
		
		System.out.println("Circle info is:-");
		System.out.println("Radius: " + c.getRadius());
		System.out.println("Color: " + c.getColor());
		System.out.println("Area: " + c.calculateArea());
		System.out.println("Perimeter" + c.calculatePerimeter());
	}
	
}
