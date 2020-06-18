package com.techlab.shoppingcart;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class Customer implements Serializable {

	private int customerID;
	private String customerName, customerAddress;
	private LinkedList<Order> orders;
	private final static String FILENAME = "src/resource/Cart.txt";
	
	
	public Customer(int customerID, String customerName, String customerAddress) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
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
				+ "\nCustomer Name: " + this.customerName
				+ "\nCustomer Address: " + this.customerAddress;
		
		for(Order o: orders) {
			result += o.toString();
		}
		
		return result;
	}
	
}
