package com.techlab.rectangle.test;

import com.techlab.rectangle.*;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();

		// case 1
		System.out.println("Case 1");

		System.out.println("Length: " + r.getLength() + "\nBreadth: " + r.getBreadth());
		//0.0 and 0.0
		// bcoz we have set it float.
		// in float we mention f like 12.3f
		// ok ok

		// case 2
		System.out.println("Case 2");

		r.setLength(30.1f);
		r.setBreadth(29.4f);

		System.out.println("Length: " + r.getLength());
		System.out.println("Breadth: " + r.getBreadth());
		r.calculateArea();

		// yes
		//yes
		// case 3
		System.out.println("Case 3");

		// System.out.println(r.setLength(12)); //error yes yes yes
		System.out.println(r.getLength());

		// case 4
		System.out.println("Case 4");

		r.setColor("black");
		System.out.println("Color: " + r.getColor());

	}

}
