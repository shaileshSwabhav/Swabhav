package com.techlab.listcrud;

import java.util.ArrayList;

public class CrudOnList {
	
	public static void main(String args[]) {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		addToList(arr, "tina");
		addToList(arr, "jonny");
		addToList(arr, "rahul");
		readFromList(arr);
		
		updateList(arr, "james", 1);
		readFromList(arr);
		
		deleteFromList(arr, 0);
		readFromList(arr);
		
	}

	public static void addToList(ArrayList<String> arr, String str) {
		arr.add(str);
	}
	
	public static void updateList(ArrayList<String> arr, String newStr, int index) {
		arr.set(index, newStr);
	}
	
	public static void readFromList(ArrayList<String> arr) {
		for(String str: arr) {
			System.out.println(str + " ");
		}
		System.out.println();
	}
	
	public static void deleteFromList(ArrayList<String> arr, int index) {
		arr.remove(index);
	}
	
}
