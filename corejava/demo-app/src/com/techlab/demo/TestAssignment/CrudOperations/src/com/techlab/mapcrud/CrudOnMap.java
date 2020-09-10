package com.techlab.mapcrud;

import java.util.*;

public class CrudOnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> arr = new HashMap<Integer, String>();

		
		addToMap(arr, 1, "jimmy");
		addToMap(arr, 18, "ocus");
		addToMap(arr, 4, "surya");
		readFromMap(arr);
		
		updateMap(arr, 18, "stuart");
		readFromMap(arr);
		
		deleteFromMap(arr, 18);
		readFromMap(arr);

	}
	
	public static void addToMap(HashMap<Integer, String> arr,int key, String value) {
		arr.put(key, value);
	}
	
	public static void updateMap(HashMap<Integer, String> arr, int key, String value) {
		arr.replace(key, value);
	}
	
	public static void readFromMap(HashMap<Integer, String> arr) {
		for (Map.Entry<Integer, String> e : arr.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println();
	}
	
	public static void deleteFromMap(HashMap<Integer, String> arr, int key) {
		arr.remove(key);
	}

}
