package com.techlab.demo.Assignment;

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
		
		value = 20;
		System.out.println("Inside PassByValue function : " + value);
	}
}

// yes
//ok mam ok
// it will just copy the value and not address
// java is pass by value
//yes
//method me 20
//main me 10
//yes

