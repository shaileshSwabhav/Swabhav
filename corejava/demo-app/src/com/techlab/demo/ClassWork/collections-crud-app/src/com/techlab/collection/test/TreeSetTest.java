package com.techlab.collection.test;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> t = new TreeSet<String>();
		
		create(t, "sam");
		create(t, "robin");
		create(t, "ram");
		read(t);
		
		update(t, "sam", "rick");
		read(t);
		
		delete(t, "ram");	
		read(t);
	}

	public static void create(TreeSet<String> t, String name) {
		t.add(name);
	}
	
	public static void read(TreeSet<String> t) {
		for(String x: t) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void update(TreeSet<String> t, String oldName, String newName) {
		t.remove(oldName);
		t.add(newName);
	}
	
	public static void delete(TreeSet<String> t, String name) {
		t.remove(name);
	}
	
}
