package com.techlab.multilevel;

public class Child extends Parent{

	public Child() {
		System.out.println("inside child ");
	}
	
	
	public Child(int foo) {
		super(foo);
		System.out.println("inside child " + foo);
	}
	
}
