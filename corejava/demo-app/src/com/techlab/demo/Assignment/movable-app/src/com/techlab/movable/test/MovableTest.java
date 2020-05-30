package com.techlab.movable.test;

import com.techlab.movable.*;

public class MovableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IMovable [] i = new IMovable[3];
		
		i[0] = new Truck();
		i[1] = new Car();
		i[2] = new Bike();
		
		printInfo(i);
	}

	public static void printInfo(IMovable [] i) {
		
		for(IMovable a: i) {
			a.start();
			a.stop();
		}
		
	}
	
}
