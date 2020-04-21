package com.techlab.demo;

public class PassByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PassByValueTest passValue = new PassByValueTest();
		int value = 10;
		
		System.out.println("Before passing value : " + value);
		
		passValue.passByValue(value);
		
		System.out.println("After pssing value : " + value);
	}
	
	void passByValue(int value) {
		
		value = value + 10;
		System.out.println("Inside PassByValue function : " + value);
	}
}
