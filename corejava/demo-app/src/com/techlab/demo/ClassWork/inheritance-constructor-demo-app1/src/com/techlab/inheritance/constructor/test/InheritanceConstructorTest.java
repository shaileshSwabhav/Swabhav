package com.techlab.inheritance.constructor.test;

import com.techlab.inheritance.constructor.*;

public class InheritanceConstructorTest {

	public static void main(String [] args) {

		Parent p = new Parent(100);
		System.out.println(p.getFoo());
		System.out.println(new Parent(150).getFoo());
		System.out.println(new Child().getFoo());
		System.out.println(new Child(120).getFoo());
		
	}
}
