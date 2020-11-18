package com.techlab.collection.test;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> h = new HashSet<String>();
		
		create(h, "abdul");
		create(h, "ram");
		create(h, "tom");
		read(h);
		
		update(h, "ram", "rock");
		read(h);
		
		delete(h, "tom");
		read(h);
		
	}

	public static void create(HashSet<String> h, String name) {
		h.add(name);
	}
	
	public static void read(HashSet<String> h) {
		for(String x: h) {
			System.out.print(x + " ");
		}
		System.out.println();

	}
	
	public static void update(HashSet<String> h, String oldName, String newName) {
		h.remove(oldName);
		h.add(newName);
	}
	
	public static void delete(HashSet<String> h, String name) {
		h.remove(name);
	}
	
	
}
