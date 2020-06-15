package com.techlab.project.test;

import java.util.ArrayList;

import com.techlab.project.*;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LineItem cart = new LineItem();
		cart.addProduct(new Product(101, "Apples", 20.2, 10));
		cart.addProduct(new Product(102, "Mango", 300.5, 12));
		cart.addProduct(new Product(103, "Oranges", 50.3, 6));
		cart.addProduct(new Product(104, "Shoes", 2500, 1));
	
		String productOne = "Apples";
		Product p1 = cart.searchProduct(productOne);
		if(p1 == null) {
			System.out.println("Product Not Found");
		} else {			
			printProduct(p1);
		}
		
		cart.deleteProduct(productOne);
		
		p1 = cart.searchProduct(productOne);
		if(p1 == null) {
			System.out.println("Product Not Found\n");
		} else {			
			printProduct(p1);
		}	
		
		p1 = cart.searchProduct("Shoes");
		if(p1 == null) {
			System.out.println("Product Not Found\n");
		} else {			
			printProduct(p1);
		}	
		
		System.out.println("Total Cart Price: " + cart.totalCartPrice());
	}
	
	public static void printProduct(Product p) {
		
		System.out.println("Product ID:  " + p.getID());
		System.out.println("Product Name: " + p.getProductName());
		System.out.println("Product Unit Price: " + p.getUnitPrice());
		System.out.println("Product Quantity: " + p.getQuantity());
		System.out.println();
		
	}

}
