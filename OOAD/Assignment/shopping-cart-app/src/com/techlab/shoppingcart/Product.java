package com.techlab.shoppingcart;

import java.io.Serializable;

public class Product implements Serializable {

	private int productID, quantity;
	private String productName;
	private double unitPrice;

	public Product(int productID, String productName, double unitPrice) {
		this.productID = productID;
		this.productName = productName;
		this.unitPrice = unitPrice;
	}
	
	public void setQuantity(int quantity) {
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
		result += "\nProducts" + "\nProduct ID: " + this.productID + "\nProduct Name: " + this.productName
				+ "\nProduct Unit Price: " + this.unitPrice + "\nProduct quantity: " + this.quantity + "\n";

		return result;
	}

}
