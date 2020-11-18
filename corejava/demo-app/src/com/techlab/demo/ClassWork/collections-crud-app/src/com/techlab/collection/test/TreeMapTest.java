package com.techlab.collection.test;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> t = new TreeMap<Integer, String>();
		
		create(t, 1, "ben");
		create(t, 2, "rick");
		create(t, 3, "morty");
		
		read(t);
		
		update(t, 1, "summers");
		
		read(t);
		
		delete(t, 1);
		
		read(t);

	}

	public static void create(TreeMap<Integer, String> t, int key, String value) {
		t.put(key, value);
	}
	
	public static void read(TreeMap<Integer, String> t) {
		System.out.println(t);
	}
	
	public static void update(TreeMap<Integer, String> t, int key, String value) {
		t.replace(key, value);
	}
	
	public static void delete(TreeMap<Integer, String> t, int key) {
		t.remove(key);
		
	}
	
}
