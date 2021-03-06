package com.techlab.composite.folder;

import java.util.ArrayList;

public class Folder implements IStorable {

	private String name;
	private ArrayList<IStorable> children = new ArrayList<IStorable>();
	
	StringBuilder sb = new StringBuilder();
	
	public Folder(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addChilder(IStorable iStorable) {
		children.add(iStorable);
	}
	
	@Override
	public void display(StringBuilder dashes) {
		// TODO Auto-generated method stub
		
		dashes.insert(0, " ");
		System.out.println(dashes.toString() + getName());

		for(IStorable e: children) {
			e.display(dashes);
		}
		dashes.setLength(0);
		dashes.append("--");

	}

}
