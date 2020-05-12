package com.techlab.demo.Assignment;

public class ConstructorOverloadingTest {

	ConstructorOverloadingTest() {
		this(5);
		System.out.println("default constructor");
	}

	ConstructorOverloadingTest(int x) {
		this("www");
		System.out.println("Integer constructor: " + x);
	}
	
	ConstructorOverloadingTest(String x) {
		System.out.println("String constructor: " + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverloadingTest c1 = new ConstructorOverloadingTest();
		ConstructorOverloadingTest c2 = new ConstructorOverloadingTest(5);
//		ConstructorOverloadingTest c3 = new ConstructorOverloadingTest("xyz");
		
	}

}
