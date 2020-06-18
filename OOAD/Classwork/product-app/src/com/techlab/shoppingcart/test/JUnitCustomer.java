package com.techlab.shoppingcart.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.techlab.shoppingcart.*;

class JUnitCustomer {

	@Test
	void testCustomerConstructor() throws Exception {

		// Arrange
		int expectedCustomerID = 101;
		String expectedCustomerName = "ben";
		Date expectedPurchaseDate = new Date(120, 01, 21);
		String expectedCustomerAddress = "mumbai";

		// Act
		Customer customer = new Customer(101, "ben", "21-02-2020", "mumbai");

		// Assert
		assertEquals(expectedCustomerID, customer.getID());
		assertEquals(expectedCustomerName, customer.getCustomerName());
		assertEquals(expectedPurchaseDate, customer.getPurchaseDate());
		assertEquals(expectedCustomerAddress, customer.getCustomerAddress());

	}

	@Test
	void testProductConstructor() {

		// Arrange
		int expectedProductID = 101;
		String expectedProductName = "shoes";
		double expectedUnitPrice = 2500.0;
		double expectedDiscount = 6.5;

		// Act
		Product product = new Product(101, "shoes", 2500, 6.5);

		// Assert
		assertEquals(expectedProductID, product.getProductID());
		assertEquals(expectedProductName, product.getProductName());
		assertEquals(expectedUnitPrice, product.getUnitPrice());
		assertEquals(expectedDiscount, product.getDiscount());

	}

	@Test
	void testAddIntoCart() throws Exception {

		// Arrange
		int expectedCustomerID = 101;
		String expectedCustomerName = "ben";
		Date expectedPurchaseDate = new Date(120, 01, 21);
		String expectedCustomerAddress = "mumbai";
		int expectedProductID = 151;
		String expectedProductName = "Shoes";
		double expectedProductUnitPrice = 2500;
		double expectedProductDiscount = 6.5;

		// Act
		Customer c1 = new Customer(101, "ben", "21-02-2020", "mumbai");
		Product p1 = new Product(151, "Shoes", 2500, 6.5);

		ArrayList<Product> a = new ArrayList<Product>();
		a.add(p1);

		HashMap<Customer, ArrayList<Product>> map = new HashMap<Customer, ArrayList<Product>>();
		map.put(c1, a);

		c1.addIntoCart(map);

		HashMap<Customer, ArrayList<Product>> result = new HashMap<Customer, ArrayList<Product>>();
		result = Customer.deserializeCustomer();

		// Assert
		for (Map.Entry<Customer, ArrayList<Product>> entry : map.entrySet()) {
			Customer cust = entry.getKey();
			ArrayList<Product> prd = entry.getValue();

			assertEquals(expectedCustomerID, cust.getID());
			assertEquals(expectedCustomerName, cust.getCustomerName());
			assertEquals(expectedPurchaseDate, cust.getPurchaseDate());
			assertEquals(expectedCustomerAddress, cust.getCustomerAddress());

			for (int i = 0; i < prd.size(); i++) {
				assertEquals(expectedProductID, prd.get(i).getProductID());
				assertEquals(expectedProductName, prd.get(i).getProductName());
				assertEquals(expectedProductUnitPrice, prd.get(i).getUnitPrice());
				assertEquals(expectedProductDiscount, prd.get(i).getDiscount());
			}

		}
	}

	@Test
	void testSearchFromCart() throws Exception {

		// Arrange
		int expectedProductID = 151;
		String expectedProductName = "Shoes";
		double expectedProductUnitPrice = 2500;
		double expectedProductDiscount = 6.5;

		// Act
		Customer c = new Customer();
		Product p = new Product(151, "Shoes", 2500, 6.5);

		ArrayList<Product> a = new ArrayList<Product>();
		a.add(p);

		ArrayList<Product> result = c.searchFromCart(a, "Shoes");

		for (int i = 0; i < result.size(); i++) {
			assertEquals(expectedProductID, result.get(i).getProductID());
			assertEquals(expectedProductName, result.get(i).getProductName());
			assertEquals(expectedProductUnitPrice, result.get(i).getUnitPrice());
			assertEquals(expectedProductDiscount, result.get(i).getDiscount());
		}
	}

	@Test
	void testDeleteFromCart() throws Exception {

		// Arrange
		int expectedProductID = 151;
		String expectedProductName = "Shoes";
		double expectedProductUnitPrice = 2500;
		double expectedProductDiscount = 6.5;

		// Act
		Customer c = new Customer();
		Product p1 = new Product(151, "Shoes", 2500, 6.5);
		Product p2 = new Product(152, "Jeans", 800, 7.5);

		ArrayList<Product> a = new ArrayList<Product>();
		a.add(p1);
		a.add(p2);

		c.deleteFromCart(a, "Jeans");

		for (int i = 0; i < a.size(); i++) {
			assertEquals(expectedProductID, a.get(i).getProductID());
			assertEquals(expectedProductName, a.get(i).getProductName());
			assertEquals(expectedProductUnitPrice, a.get(i).getUnitPrice());
			assertEquals(expectedProductDiscount, a.get(i).getDiscount());
		}

	}

}
