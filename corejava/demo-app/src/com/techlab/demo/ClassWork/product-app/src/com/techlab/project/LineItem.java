package com.techlab.project;

import java.util.ArrayList;

public class LineItem {

	ArrayList<Product> product;
	
	public LineItem() {
		product = new ArrayList<Product>();
	}
	
	public void addProduct(Product newProduct) {
		product.add(newProduct);
	}
	
	public void deleteProduct(String productName) {
		for(int i = 0; i < product.size(); i++) {
			if(product.get(i).getProductName().equals(productName)) {
				product.remove(i);
			}
		}
	}
	
	public Product searchProduct(String productName) {
		int index = -1;
		for(int i = 0; i < product.size(); i++) {
			if(product.get(i).getProductName().equals(productName)) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			return null;
		} else {
			return product.get(index);
		}
	}
	
	public double totalCartPrice() {
		double totalPrice = 0.0;
		
		for(Product p: product) {
			totalPrice += p.getUnitPrice() * p.getQuantity();
		}
		
		return totalPrice;
	}
	
}
