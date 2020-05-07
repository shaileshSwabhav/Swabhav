package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		Circle c2;
		
		c2 = c1;
		
		c2.setRadius(15.3f);
		c2.setColor("Purple");
		
		System.out.println("Main: " + c1.hashCode() + " " +c2.hashCode());
		
		printInfo(c1);
		printInfo(c2);

	}
	
	public static void printInfo(Circle c) {
		
		System.out.println("Radius: " + c.getRadius());
		System.out.println("Color: " + c.getColor());
		System.out.println("HashCode: " + c.hashCode());
		
	}

}
