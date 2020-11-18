package com.techlab.collection.test;

import java.util.ArrayList;

import com.techlab.collection.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		
		cart.add(new LineItem(101, "Apple", 30, 10));
		cart.add(new LineItem(105, "Banana", 15, 5));
		cart.add(new LineItem(199, "ToothPaste" , 85, 2));
		
		printProductInfo(cart);
		System.out.println();
		printCartPrice(cart);
		
	}
	
	public static void printProductInfo(ArrayList<LineItem> cart) {
		System.out.println("Product List:");
		for(LineItem l: cart) {
			System.out.println(l.getName());
		}	
	}
	public static void printCartPrice(ArrayList<LineItem> cart) {
		
		double sum = 0.0;
		
		for(LineItem l: cart) {
			sum += l.calculateTotal();
		}
		System.out.println("Total Price: " + sum);
	}

}
