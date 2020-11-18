package com.techlab.composite;

import java.util.ArrayList;

public class Composite implements IComponent, IAddComponent {

	String name;
	ArrayList<IComponent> components = new ArrayList<IComponent>();
	
	public Composite(String name) {
		this.name = name;
	}

	@Override
	public void showPrice() {
		// TODO Auto-generated method stub
		System.out.println(name);
		for(IComponent c: components) {
			c.showPrice();
		}
		
	}

	@Override
	public void addComponent(IComponent comp) {
		// TODO Auto-generated method stub
		components.add(comp);
	}

}
