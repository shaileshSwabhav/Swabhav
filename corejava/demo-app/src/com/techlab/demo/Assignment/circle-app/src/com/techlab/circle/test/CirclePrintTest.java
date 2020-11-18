package com.techlab.circle.test;
import com.techlab.circle.*;

public class CirclePrintTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle();
				
		c.setRadius(10.5f);
		c.setColor("pink");
		
		printCircleInfo(c); 
		
		//call all getters and calculate area through object 
		
	}
	
	public static void printCircleInfo(Circle c) {
		
		
		Circle c1 = new Circle();
		
		System.out.println(c.hashCode() + " " + c1.hashCode());

		System.out.println(c.getRadius());
		System.out.println(c.getColor());
		System.out.println(c.calculateArea());
		System.out.println(c1.getRadius());
		System.out.println(c1.getColor());
		System.out.println(c1.calculateArea());
		
	}
	
}
