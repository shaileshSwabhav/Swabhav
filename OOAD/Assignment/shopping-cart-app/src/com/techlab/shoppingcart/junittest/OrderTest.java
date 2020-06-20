package com.techlab.shoppingcart.junittest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.techlab.shoppingcart.*;

class OrderTest {

	@Test
	void testOrderConstructor() throws Exception {
		
		// Arrange
		int expectedOrderID = 1201;
		Date expectedOrderDate = new Date(120, 01, 21);
		LineItem cart = new LineItem(101);
		
		// Act
		Order o = new Order(1201, "21/02/2020", new LineItem(101));
		
		// Assert
		assertEquals(expectedOrderID, o.getOrderID());
		assertEquals(expectedOrderDate, o.getOrderDate());
		assertEquals(cart.getCartID(), o.getLineItem().getCartID());		
	}
	
	@Test
	void testCancelOrder() throws Exception {
		
		// Arrange
		int expectedOrderID = 1201;
		Date expectedOrderDate = new Date(120, 01, 21);
		LineItem cart = null;
		
		// Act
		Order o = new Order(1201, "21/02/2020", new LineItem(101));
		o.cancelOrder();
		
		// Assert
		assertEquals(expectedOrderID, o.getOrderID());
		assertEquals(expectedOrderDate, o.getOrderDate());
		assertEquals(cart, o.getLineItem());
	}

}
