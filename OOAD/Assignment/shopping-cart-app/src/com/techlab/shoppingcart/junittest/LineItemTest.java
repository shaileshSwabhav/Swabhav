package com.techlab.shoppingcart.junittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

import com.techlab.shoppingcart.*;

class LineItemTest {

	@Test
	void testLineItemTest() {
		
		// Arrange
		int expectedCartID = 101;
		int expectedProductID = 2001;
		String expectedProductName = "Shoes";
		double expectedUnitPrice = 2500.0;
		int expectedQuantity = 1;
		
		// Act
		LinkedList<Product> p = new LinkedList<Product>();
		p.add(new Product(2001, "Shoes", 2500.0, 1));
		LineItem cart = new LineItem(101, p);
	}

}
