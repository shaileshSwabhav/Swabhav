package com.techlab.shoppingcart.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.shoppingcart.*;

class LineItemTest {

	@Test
	void testLineItemTestConstructor() {

		// Arrange
		int expectedCartID = 101;

		// Act
		LineItem cart = new LineItem(101);
		Product p = new Product(101, "Shoes", 2500);
		cart.addToCart(p, 5);

		// Assert
		assertEquals(expectedCartID, cart.getCartID());
	}

	@Test
	void testAddToCart() {

		// Arrange
		int expectedProductSize = 2;

		// Act
		LineItem cart = new LineItem(1501);
		Product p1 = new Product(101, "Shoes", 2500);
		cart.addToCart(p1, 5);

		Product p2 = new Product(101, "Shoes", 2500);
		cart.addToCart(p2, 2);

		Product p3 = new Product(102, "Books", 200);
		cart.addToCart(p3, 3);

		// Assert
		assertEquals(expectedProductSize, cart.getCartSize());
	}

	@Test
	void testSearchProductByID() {

		// Arrange
		int expectedProductID = 101;
		String expectedProductName = "Shoes";
		double expectedUnitPrice = 2500.0;
		int expectedQuantity = 2;

		// Act
		LineItem cart = new LineItem(1501);
		Product p1 = new Product(101, "Shoes", 2500);
		cart.addToCart(p1, 5);

		Product p2 = new Product(101, "Shoes", 2500);
		cart.addToCart(p2, 2);

		Product p = cart.searchProductByID(expectedProductID);

		// Assert
		assertEquals(expectedProductID, p.getProductID());
		assertEquals(expectedProductName, p.getProductName());
		assertEquals(expectedUnitPrice, p.getUnitPrice());
		assertEquals(expectedQuantity, p.getQuantity());
	}

	@Test
	void testDeleteProductByID() {

		// Arrange
		int expectedSize = 1;		
		
		// Act
		LineItem cart = new LineItem(1501);
		Product p1 = new Product(101, "Shoes", 2500);
		cart.addToCart(p1, 5);
		
		Product p2 = new Product(101, "Shoes", 2500);
		cart.addToCart(p2, 2);
		
		Product p3 = new Product(102, "Books", 200);
		cart.addToCart(p3, 3);
		
		cart.deleteProductByID(102);

		// Assert
		assertEquals(expectedSize, cart.getCartSize());
	}

	@Test
	void testTotalCartPrice() {
		
		// Arrange
		double expectedCartPrice = 1000.0;
		
		// Act
		LineItem cart = new LineItem(1501);
		Product p1 = new Product(101, "Earphones", 200);
		cart.addToCart(p1, 5);
		
		Product p2 = new Product(101, "Earphones", 200);
		cart.addToCart(p2, 2);
		
		Product p3 = new Product(102, "Books", 200);
		cart.addToCart(p3, 3);
		
		// Assert
		assertEquals(expectedCartPrice, cart.totalCartCost());
	}
	
}
