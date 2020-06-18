package com.techlab.shoppingcart;

public class Product {
	
	private int productID, quantity;
	private String productName;
	private double unitPrice;
	
	public Product(int productID, String productName, double unitPrice, int quantity) {
		this.productID = productID;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public int getProductID() {
		return productID;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getUnitPrice() {
		return unitPrice;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "\nProducts\n" + "Product ID: " + this.productID 
				+ "\nProduct Name: " + this.productName 
				+ "\nProduct Unit Price: " + this.unitPrice
				+ "\nProduct quantity: " + this.quantity;
				
		return result;
	}

}
