package com.techlab.demo;

public class StringImmutabilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringImmutabilityTest stringImmutable = new StringImmutabilityTest();
		stringImmutable.stringImmute();
	}

	void stringImmute() {
		
		String str = "Java";
		String str1 = str;
		
		System.out.println("Before changing str and str1 : " + str + " " + str1);
		
		str = "code";

		System.out.println("After changing str and str1 : " + str + " " + str1);
	}
	
}
