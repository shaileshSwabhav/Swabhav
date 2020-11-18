package com.techlab.staticvariable.test;

public class CounterWithStaticTest {

	static int count = 0;
	public CounterWithStaticTest() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CounterWithStaticTest c1 = new CounterWithStaticTest();
		CounterWithStaticTest c2 = new CounterWithStaticTest();
		CounterWithStaticTest c3 = new CounterWithStaticTest();
		
	}

}
