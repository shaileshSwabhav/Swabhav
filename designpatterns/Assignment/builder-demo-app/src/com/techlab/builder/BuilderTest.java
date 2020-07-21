package com.techlab.builder;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p = new PhoneBuilder().setOs("Android").setBattery(4000).getPhone();
		
		System.out.println(p);
		
	}

}
