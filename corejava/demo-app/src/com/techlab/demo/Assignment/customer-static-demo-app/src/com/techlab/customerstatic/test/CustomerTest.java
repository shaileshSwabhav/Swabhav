package com.techlab.customerstatic.test;

import com.techlab.customerstatic.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c1 = new Customer("abc", 10);
		Customer c2 = new Customer("xyz", 20);
		Customer c3 = new Customer("pqr", 30);
		
		printInfo(c1);
		printInfo(c2);
		printInfo(c3);
		
	}
	
	public static void printInfo(Customer c) {
		
		System.out.println("ID: " + c.getID());
		System.out.println("Name: " + c.getName());
		System.out.println("Order: " + c.getOrder());
		System.out.println();
		
	}

}
