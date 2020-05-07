package com.techlab.circle.test;

import com.techlab.circle.*;

public class CircleArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle [] c = new Circle[3];
		
		c[0] = new Circle();
		c[0].setRadius(12.4f);
		c[0].setColor("Purple");
		
		Circle c1 = new Circle();
		c1.setRadius(15.2f);
		c1.setColor("red");
		
		Circle c2 = new Circle();
		c2.setRadius(18.2f);
		c2.setColor("grey");
		
		c[1] = c1;
		c[2] = c2;
		
		printInfo(c);
		
	}

	public static void printInfo(Circle [] c) {

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getRadius());
			System.out.println(c[i].getColor());
			System.out.println(i + " HashCode is: " +c[i].hashCode());
		}
		
	}

}
