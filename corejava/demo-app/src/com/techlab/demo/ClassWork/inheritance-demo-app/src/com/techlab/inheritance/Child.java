package com.techlab.inheritance;

public class Child extends Base {
	
	int foo;
	public Child(int foo) {
		super(foo);
		System.out.println("hi inside child " +foo);
	}
}
