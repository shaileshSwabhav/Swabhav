package com.techlab.factory.test;

import com.techlab.factory.AutoMobileFactory;
import com.techlab.factory.AutoType;
import com.techlab.factory.IAutoMobile;

public class AutoMobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoMobileFactory factory = new AutoMobileFactory();
		
		IAutoMobile bmw = factory.make(AutoType.BMW);
		
		bmw.start();
		bmw.stop();
	}

}
