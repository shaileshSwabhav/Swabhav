package com.techlab.pattern.test;

import com.techlab.pattern.*;

public class AutoMobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoMobileFactory factory = AutoMobileFactory.getInstance();
		
		IAutoMobile bmw = factory.make(AutoType.BMW);
		bmw.start();
		bmw.stop();
		System.out.println(bmw.hashCode());
		
		IAutoMobile audi = factory	.make(AutoType.BMW);
		audi.start();
		audi.stop();
		System.out.println(audi.hashCode());
	}

}
