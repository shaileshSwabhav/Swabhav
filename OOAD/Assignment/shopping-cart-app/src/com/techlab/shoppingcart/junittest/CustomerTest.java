package com.techlab.shoppingcart.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.shoppingcart.*;

class CustomerTest {

	@Test
	void testCustomerConstructor() {

		// Arrange
		int expectedCustomerID = 1001;
		String expectedCustomerName = "Sam";
		String expectedCustomerAddress = "Mumbai";
		
		// Act
		Customer c = new Customer(1001, "Sam", "Mumbai");
		
		// Assert
		assertEquals(expectedCustomerID, c.getCustomerID());
		assertEquals(expectedCustomerName, c.getCustomerName());
		assertEquals(expectedCustomerAddress, c.getCustomerAddress());	
	}
	
	@Test
	void testAddOrder() throws Exception {
		
		// Arrange
		int expectedOrderSize = 2;
		
		// Act
		Order o1 = new Order(1201, "21/02/2020", new LineItem(101));
		Order o2 = new Order(1202, "15/03/2020", new LineItem(102));
		
		Customer c = new Customer(1001, "Sam", "Mumbai");
		c.addOrder(o1);
		c.addOrder(o2);
		
		// Assert
		assertEquals(expectedOrderSize, c.getOrders().size());
	}

}
