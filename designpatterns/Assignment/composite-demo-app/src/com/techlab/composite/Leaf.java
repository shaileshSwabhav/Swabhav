package com.techlab.composite;

public class Leaf implements IComponent {

	int price;
	String name;

	public Leaf(String name, int price) {
		this.price = price;
		this.name = name;
	}

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name + ": " + price);
	}

}
