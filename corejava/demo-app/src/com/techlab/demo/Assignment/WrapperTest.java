package com.techlab.demo.Assignment;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;

		Integer b = new Integer(5); // Boxing (Wrapping)
		Integer c = 5; // Auto Boxing (Auto Wrapping)

		int d = b.intValue(); // Unboxing (Unwrapping)
		int e = b;
		String s = "123";
		int x = Integer.parseInt(s);
		System.out.println(x);

		
		if (c == b) {
			System.out.println("equal");
		} else {
			System.out.println("unequal");
		}
		
		if (c.equals(b)) {
			System.out.println("equal");
		} else {
			System.out.println("unequal");
		}

	}

}
