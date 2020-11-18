package com.techlab.collection.test;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> l = new LinkedList<String>();
		
		create(l, "sam");
		create(l, "tom");
		create(l, "ram");
		read(l);
		
		update(l, 2, "robin");
		read(l);
		
		delete(l, 2);
		read(l);
		
	}
	
	public static void create(LinkedList<String> l, String name) {
		l.add(name);
	}
	
	public static void read(LinkedList<String> l) {
		for(String x: l) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void update(LinkedList<String> l, int index, String name) {
		l.set(index, name);		
	}
	
	public static void delete(LinkedList<String> l, int index) {
		l.remove(index);
	}

}
