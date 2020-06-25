package com.techlab.ispsolution.test;

import com.techlab.ispsolution.*;

public class ISPSolutionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager m = new Manager();
		Robot r = new Robot();
		
		m.startWork();
		m.stopWork();
		m.startEat();
		m.stopEat();
		
		r.startWork();
		r.stopWork();
		
	}

}
