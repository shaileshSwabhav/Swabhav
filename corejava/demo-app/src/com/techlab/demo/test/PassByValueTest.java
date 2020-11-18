package com.techlab.demo.test;

public class PassByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		mutableData(a);
		System.out.println(a);
		
		int [] b = {10, 20, 30, 40};
		mutableArrayvalue(b);
		
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		
	}
	
	static void mutableData(int n) {
		n = 20;
		
	}
	
	static void mutableArrayvalue (int [] a) {
		for(int i = 0; i < a.length ; i++) {
			a[i] = 0;
		}
	}

}
