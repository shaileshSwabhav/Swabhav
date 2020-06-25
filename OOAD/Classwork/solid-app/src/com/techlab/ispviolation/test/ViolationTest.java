package com.techlab.ispviolation.test;

import com.techlab.ispviolation.*;

public class ViolationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IWorkable m = new Manager();
		IWorkable r = new Robot();
		
		m.startWork();
		m.stopWork();
		m.startEat();
		m.stopEat();
		
		r.startWork();
		r.stopWork();
		r.startEat();
		r.stopEat();
		

	}

}
