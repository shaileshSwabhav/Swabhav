package com.techlab.collection.test;

import java.util.LinkedHashSet;

public class LinkedHashsSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		
		create(s, "sam");
		create(s, "abdul");
		create(s, "ram");
		read(s);
		
		update(s, "sam", "ben");
		read(s);
		
		delete(s, "ben");
		read(s);
	}

	public static void create(LinkedHashSet<String> s, String name) {
		s.add(name);
	}
	
	public static void read(LinkedHashSet<String> s) {
		for(String x: s) {
			System.out.print(x + " ");
		}
		System.out.println();

	}
	
	public static void update(LinkedHashSet<String> s, String oldName, String newName) {
		s.remove(oldName);
		s.add(newName);
	}
	
	public static void delete(LinkedHashSet<String> s, String name) {
		s.remove(name);
	}
	
}
