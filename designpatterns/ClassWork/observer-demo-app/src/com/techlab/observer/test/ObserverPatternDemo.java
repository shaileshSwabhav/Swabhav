package com.techlab.observer.test;

import com.techlab.observer.*;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new Subject();

		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		
		System.out.println();
		
		System.out.println("Second state change: 8");
		subject.setState(8);
	}

}
