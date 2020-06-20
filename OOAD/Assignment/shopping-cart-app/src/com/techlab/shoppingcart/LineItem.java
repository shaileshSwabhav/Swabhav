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

		Product p = searchProductByID(product.getProductID());
		if (p != null) {
			p.setQuantity(quantity);
		} else {
			products.add(product);
			product.setQuantity(quantity);
		}

	}

	public Product searchProductByID(int pID) {

		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getProductID() == pID) {
				return products.get(i);
			}
		}
		return null;
	}

	public void deleteProductByID(int pID) {

		Product p = searchProductByID(pID);
		if (p != null) {
			products.remove(p);
		}
	}
	
	public double totalCartCost() {
		double totalCost = 0.0;

		for (Product p : products)
			totalCost += p.getUnitPrice() * p.getQuantity();

		return totalCost;
	}

	public int getCartSize() {
		return products.size();
	}

	public LinkedList<Product> displayCart() {
		return products;
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
