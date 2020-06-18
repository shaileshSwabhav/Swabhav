package com.techlab.shoppingcart.test;

import java.util.LinkedList;

import com.techlab.shoppingcart.*;

public class ShoppingTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList<Product> p1 = new LinkedList<Product>();
		p1.add(new Product(101, "Apples", 20.2, 5));
		p1.add(new Product(102, "Mangoes", 15, 2));

		LinkedList<Product> p2 = new LinkedList<Product>();
		p2.add(new Product(110, "Shoes", 2500, 1));
		p2.add(new Product(152, "Jeans", 1200, 2));

		LinkedList<Product> p3 = new LinkedList<Product>();
		p3.add(new Product(193, "Earphones", 800, 2));
		p3.add(new Product(172, "Charger", 400, 1));

		LineItem cart1 = new LineItem(2031, p1);
		LineItem cart2 = new LineItem(2035, p2);
		LineItem cart3 = new LineItem(2032, p3);

		Order o1 = new Order(1501, "21/02/2018", cart1);
		Order o2 = new Order(1502, "15/05/2019", cart2);
		Order o3 = new Order(1503, "06/07/2020", cart3);

		Customer cust = new Customer(901, "Sam", "Mumbai");
		cust.addOrder(o1);
		cust.addOrder(o2);
		cust.addOrder(o3);

		printCustomerInfo(cust);
		printOrderInfo(o1);
		printOrderInfo(o2);
		printOrderInfo(o3);
//		printLineItemInfo(cart1);
//		printLineItemInfo(cart2);
//		printLineItemInfo(cart3);
//		printProducts(p1);
//		printProducts(p2);
//		printProducts(p3);

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
