package com.techlab.shoppingcart;

import java.util.LinkedList;

public class LineItem {

	private int cartID;
	private LinkedList<Product> products;
	
	
	public LineItem(int cartID, LinkedList<Product> products) {
		this.cartID = cartID;
		this.products = products;
	}
	
	public int getCartID() {
		return cartID;
	}
	
	public void addProduct(Product p) {
		products.add(p);
	}
	
	public Product searchProduct(String productName) {
		
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getProductName().equalsIgnoreCase(productName)) {
				return products.get(i);
			}
		}
		return null;
	}
	
	public void deleteProduct(String productName) {
		
		for(int i = 0; i < products.size(); i++) {
			if(products.get(i).getProductName().equalsIgnoreCase(productName)) {
				products.remove(i);
			}
		}
	}
	
	public LinkedList<Product> showCart() {
		return products;
	}
	
	@Override
	public String toString() {
		
		String result = "";
		result += "\nLineItem\n" + "Cart ID: " + this.cartID;
		
		for(Product p: products) {
			result += p.toString();
		}
	
		return result;
	}
	
}
