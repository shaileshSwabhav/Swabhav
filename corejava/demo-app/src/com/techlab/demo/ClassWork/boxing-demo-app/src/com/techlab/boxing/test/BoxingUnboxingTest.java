package com.techlab.boxing.test;

public class BoxingUnboxingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		implictTypecast();
		explictTypecast();
		boxingAutoboxing();
		unboxingAutounboxing();
		
	}
	
	public static void implictTypecast() {
		
		System.out.println("Implict Type Cast");
		int x = 100;
		double z = x;
		
		System.out.println("integer: " +x);
		System.out.println("double: " + z);

	}
	
	public static void explictTypecast() {
		
		System.out.println("\nExplict Type Cast");
		double x = 100.102;
		int z = (int) x;
		
		System.out.println("double: " + x);
		System.out.println("int: " + z);
		
	}
	
	public static void boxingAutoboxing() {
		
		System.out.println("\nBoxing and Auto Boxing");
		int a = 5;
		Integer b = new Integer(5); // Boxing (Wrapping)
		Integer c = 5; // Auto Boxing (Auto Wrapping)
		
		System.out.println("Boxing: " + b);
		System.out.println("Auto Boxing: " + c);
		
	}
	
	public static void unboxingAutounboxing() {
		
		System.out.println("\nUnBoxing and Auto UnBoxing");
		Integer b = new Integer(10);
		int d = b.intValue(); // Unboxing (Unwrapping)
		int e = b;			  // Auto Unboxing (Auto Unwrapping)	
		
		System.out.println("Unboxing: " + d);
		System.out.println("Auto Unboxing: " + e);
		
	}

}
