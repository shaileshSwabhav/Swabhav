package com.techlab.demo.Assignment;

public class CommandLineArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
		
	}
}
