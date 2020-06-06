package com.techlab.collection.test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		
		create(a, "sam");
		create(a, "tom");
		create(a, "ram");
		read(a);

		update(a, 2, "robin");
		read(a);
		
		delete(a, 2);	
		read(a);
		
	}
	
	public static void create(ArrayList<String> a, String name) {
		a.add(name);
	}

	public static void read(ArrayList<String> a) {
		for(String x: a) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void update(ArrayList<String> a, int index, String name) {
		a.set(index, name);
	}
	
	public static void delete(ArrayList<String> a, int index) {
		a.remove(index);
	}
	

}

