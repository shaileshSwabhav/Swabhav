package com.techlab.circletest;
import com.techlab.circle.*;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle();
		
		c.setRadius(6.8f);
		c.setColor("yellow");
		
		System.out.println("Radius: " + c.getRadius());
		System.out.println("Color: " + c.getColor());
		
		c.setColor("grEY");
		System.out.println("Color: " + c.getColor());
		
		System.out.println("Area: " + c.calculateArea());
		System.out.println("Perimeter: " + c.calculatePerimeter());

	}

}
