package com.techlab.shoppingcart.test;

import java.util.ArrayList;
import java.util.LinkedList;

import com.techlab.shoppingcart.*;

public class ShoppingTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SerializeCustomer serialize = new SerializeCustomer();
		ArrayList<Customer> cust = new ArrayList<Customer>();

		Product product1 = new Product(101, "Books", 100.45);
		Product product2 = new Product(102, "Earphones", 500);

		Product prd1 = new Product(110, "Shoes", 2500);
		Product prd2 = new Product(152, "Jeans", 400);

		LineItem cart1 = new LineItem(2321);
		LineItem cart2 = new LineItem(2035);
		LineItem cart3 = new LineItem(2033);

		cart1.addToCart(product1, 2);
		cart1.addToCart(product2, 3);

		cart2.addToCart(prd1, 1);
		cart2.addToCart(prd2, 3);

		Order o1 = new Order(512, "12/03/2017", cart1);
		Order o3 = new Order(1504, "15/05/2019", cart3);

		Customer cust1 = new Customer(114, "Sam", "Mumbai");
		Customer cust2 = new Customer(103, "ben", "pune");
		cust1.addOrder(o1);

		cust.add(cust1);
		cust.add(cust2);
		
		serialize.serializeCustomer(cust);
		cust = serialize.deserializeCustomer();
		
		Customer cust3 = new Customer(104, "john", "nagpur");
		cust3.addOrder(o3);
		cust.add(cust3);
		
		serialize.serializeCustomer(cust);	
		cust = serialize.deserializeCustomer();
		
		System.out.println(cust);
	}

	public static void printCustomerInfo(Customer c) {
		System.out.println(c);
	}

	public static void printOrderInfo(Order orders) {
		System.out.println(orders);
	}

	public static void printLineItemInfo(LineItem cart) {
		System.out.println(cart);
	}

	public static void printProducts(LinkedList<Product> product) {
		for (Product p : product)
			System.out.println(p);
	}

}
