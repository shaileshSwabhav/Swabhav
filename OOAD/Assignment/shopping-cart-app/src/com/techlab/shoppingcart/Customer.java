package com.techlab.shoppingcart;

import java.util.LinkedList;

public class Customer {

	private int customerID;
	private String customerName, customerAddress;
	private LinkedList<Order> orders;
	
	public Customer(int customerID, String customerName, String customerAddress) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
//		this.orders = orders;
		this.orders = new LinkedList<Order>();
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	public LinkedList<Order> getOrders() {
		return orders;
	}
	
	@Override
	public String toString() {
		
		String result = "";
		result += "\nCustomer\n" + "Customer ID:" + this.customerID
				+ " Customer Name: " + this.customerName
				+ " Customer Address: " + this.customerAddress;
		
		return result;
	}
	
}
