package com.techlab.shoppingcart;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Order {
	
	private int orderID;
	private LineItem lineItem;
	private Date orderDate;
	
	public Order(int orderID, String orderDate, LineItem lineItem) throws Exception {
		this.orderID = orderID;
		this.orderDate = setDate(orderDate);
		this.lineItem = lineItem;
	}
	
	private Date setDate(String orderDate) throws Exception {
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyy");
		Date date = s.parse(orderDate);
		
		return date;		
	}
	
	public int getOrderID() {
		return orderID;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	
	public LineItem getLineItem() {
		return lineItem;
	}
	
	@Override
	public String toString() {
		
		String result = "";
		
		result += "\nOrders\n" + "Order ID: " + this.orderID
				+ "\nOrder Date: " + this.orderDate;
		
		result += lineItem.toString();
		
		return result;
	}
	

}
