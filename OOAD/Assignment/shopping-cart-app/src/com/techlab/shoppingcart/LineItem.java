package com.techlab.shoppingcart;

import java.io.Serializable;
import java.util.LinkedList;

public class LineItem implements Serializable {

	private int cartID;
	private LinkedList<Product> products;

	public LineItem(int cartID) {
		this.cartID = cartID;
		this.products = new LinkedList<Product>();
	}

	public int getCartID() {
		return cartID;
	}

	public void addToCart(Product product, int quantity) {
		boolean productFound = false;

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProductID() == (product.getProductID())) {
				products.get(i).setQuantity(quantity);
				productFound = true;
			}
		}

		if (!productFound) {
			products.add(product);
			product.setQuantity(quantity);
		}
	}

	public Product searchProduct(String productName) {

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProductName().equalsIgnoreCase(productName)) {
				return products.get(i);
			}
		}
		return null;
	}

	public void deleteProduct(String productName) {

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProductName().equalsIgnoreCase(productName)) {
				products.remove(i);
			}
		}
	}

	public LinkedList<Product> displayCart() {
		return products;
	}

	public double totalCartCost() {
		double totalCost = 0.0;

		for (Product p : products)
			totalCost += p.getUnitPrice() * p.getQuantity();

		return totalCost;
	}

	@Override
	public String toString() {

		String result = "";
		result += "\nLineItem\n" + "Cart ID: " + this.cartID;

		for (Product p : products) {
			result += p.toString();
		}

		result += "\nTotal Cart Cost: " + this.totalCartCost() + "\n";

		return result;
	}

}
