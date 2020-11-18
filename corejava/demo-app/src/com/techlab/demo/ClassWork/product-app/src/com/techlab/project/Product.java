package com.techlab.project;

public class Product {

	private int id, quantity;
	private String productName;
	private double unitPrice;
	
	public Product(int id, String productName, double unitPrice, int quantity) {
		this.id = id;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}
	
	public int getID() {
		return id;
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
	
}
