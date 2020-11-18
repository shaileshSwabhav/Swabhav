package com.techlab.shoppingcart.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.techlab.shoppingcart.Customer;

public class JUnit4 {

	@BeforeClass
	public static void m5() throws Exception {
		System.out.println("Using BeforeClass");
	}
	
	@Before
	public void m7() {
		System.out.println("Using Before");
	}

	@Test
	public void testCustomerConstructor() throws Exception {

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
		System.out.println("TEST CASE");
	}

	@AfterClass
	public static void m6() throws Exception {
		System.out.println("Using AfterClass");
	}
	
	@After
	public void m8() {
		System.out.println("Using After");
	}

}
