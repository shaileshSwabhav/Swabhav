package com.techlab.setcrud;

import java.util.HashSet;

public class CrudOnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> arr = new HashSet<String>();
		
		addToSet(arr, "divya");
		addToSet(arr, "james");
		addToSet(arr, "rahul");
		readFromSet(arr);
		
		updateSet(arr, "jonny", "james");
		readFromSet(arr);
		
		deleteFromSet(arr, "rahul");
		readFromSet(arr);
		
	}
	
	public static void addToSet(HashSet<String> arr, String str) {
		arr.add(str);
	}
	
	public static void updateSet(HashSet<String> arr, String oldStr, String newStr) {
		arr.remove(oldStr);
		arr.add(newStr);
	}
	
	public static void readFromSet(HashSet<String> arr) {
		for(String str: arr) {
			System.out.println(str + " ");
		}
		System.out.println();
	}
	
	public static void deleteFromSet(HashSet<String> arr, String str) {
		arr.remove(str);
	}

}
