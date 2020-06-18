package com.techlab.shoppingcart.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.shoppingcart.Product;

class ProductTest {

	@Test
	void testProductConstructor() {
		
		// Arrange
		int expectedProductID = 101;
		String expectedProductName = "Shoes";
		double expectedUnitPrice = 2500.0;
		int expectedQuantity = 1;
		
		// Act
		Product p = new Product(101, "Shoes", 2500, 1);
		
		// Assert
		assertEquals(expectedProductID, p.getProductID());
		assertEquals(expectedProductName, p.getProductName());
		assertEquals(expectedUnitPrice, p.getUnitPrice());
		assertEquals(expectedQuantity, p.getQuantity());
	}

}
