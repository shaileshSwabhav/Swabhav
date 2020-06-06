package com.techlab.collection.test;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer, String> m = new LinkedHashMap<Integer, String>();
		
		create(m, 1, "rick");
		create(m, 2, "morty");
		create(m, 3, "jesscia");	
		read(m);
		
		update(m, 3, "ben");
		read(m);
		
		delete(m, 3);	
		read(m);
		

	}
	
	public static void create(LinkedHashMap<Integer, String> m, int key, String value) {
		m.put(key, value);
	}
	
	public static void read(LinkedHashMap<Integer, String> m) {
		System.out.println(m);
	}
	
	public static void update(LinkedHashMap<Integer, String> m, int key, String value) {
		m.replace(key, value);
	}
	
	public static void delete(LinkedHashMap<Integer, String> m, int key) {
		m.remove(key);
		
	}

}
