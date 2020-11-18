package com.techlab.inheritance;

public class Child extends Base {
	
	public int foo2;
	public Child() {
		System.out.println("hi inside child " +foo2);
	}
	
	public void display() {
		System.out.println(foo2);
	}
}
