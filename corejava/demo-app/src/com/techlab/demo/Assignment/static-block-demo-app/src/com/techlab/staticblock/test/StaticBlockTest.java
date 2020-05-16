package com.techlab.staticblock.test;

public class StaticBlockTest {

	static int a, b;
	
	static {
		a = 20;
		b = 50;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("a + b = " + (a+b));
	}

}
