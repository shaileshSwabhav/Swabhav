package com.techlab.multilevel;

public class Parent extends GrandParent {
	
	public Parent() {
		System.out.println("inside parent");
	}
	
	public Parent(int foo) {
		super(foo);
		System.out.println("inside parent " + foo);
	}

}
