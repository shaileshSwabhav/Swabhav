package com.techlab.account.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.account.Account;

class AccountTest {

	@Test
	void testAccountConstructor() throws Exception {
		
		// Arrange
		String expectedAccName = "Sam";
		double expectedBalance = 5000.0;
	
		// Act
		Account a = new Account("Sam", 5000.0);
		
		// Assert
		assertEquals(expectedAccName, a.getName());
		assertEquals(expectedBalance, a.getBalance());	
	}
	
	
	
	@Test
	void testDeposit() {
		
		// Arrange
		String expectedAccName = "Sam";
		double expectedBalance = 6000.0;
	
		// Act
		Account a = new Account("Sam", 5000.0);
		a.deposit(1000);
		
		assertEquals(expectedBalance, a.getBalance());
	}
	
	@Test
	void testWithdraw() {
		
		// Arrange
		String expectedAccName = "Sam";
		double expectedBalance = 4000.0;
	
		// Act
		Account a1 = new Account("Sam", 5000.0);
		Account a2 = new Account("Tom", 200.0);
		
		a1.withdraw(1000);
		
		assertEquals(expectedBalance, a1.getBalance());
		
	}
	
}
