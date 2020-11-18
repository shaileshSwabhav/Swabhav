package com.techlab.collection.test;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		create(h, 1, "sam");
		create(h, 2, "tom");
		create(h, 5, "ben");
		
		read(h);
		
		update(h, 2, "chris");
		
		read(h);
		
		delete(h, 1);
		
		read(h);
		
	}
	
	public static void create(HashMap<Integer, String> h, int key, String value) {
		h.put(key, value);
	}
	
	public static void read(HashMap<Integer, String> h) {
		System.out.println(h);
	}
	
	public static void update(HashMap<Integer, String> h, int key, String value) {
		h.replace(key, value);
	}
	
	public static void delete(HashMap<Integer, String> h, int key) {
		h.remove(key);
		
	}

}
