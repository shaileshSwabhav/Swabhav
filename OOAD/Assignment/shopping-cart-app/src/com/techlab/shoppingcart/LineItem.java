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
	
	public double totalCartCost() {
		double totalCost = 0.0;
		
		for(Product p: products)
			totalCost += p.getUnitPrice() * p.getQuantity();
		
		return totalCost;
	}
	
	@Override
	public String toString() {
		
		String result = "";
		result += "\nLineItem\n" + "Cart ID: " + this.cartID
				+ "\nTotal Cart Cost: " + this.totalCartCost();
		
		for(Product p: products) {
			result += p.toString();
		}
	
		return result;
	}
	
}
