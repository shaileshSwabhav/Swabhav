package com.techlab.circle.test;

import com.techlab.circle.Circle;

public class CircleAnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(new Circle());
		System.out.println("Main Hashcode: " + new Circle().hashCode());

		new Circle().setRadius(11.4f);
		new Circle().setColor("pink");

		System.out.println(new Circle().getRadius());
		System.out.println(new Circle().getColor());

		printInfo(new Circle());

	}

	public static void printInfo(Circle c) {

		System.out.println(c.getRadius());
		System.out.println(c.getColor());
		System.out.println("Inside Method: " + c.hashCode());

	}

}
