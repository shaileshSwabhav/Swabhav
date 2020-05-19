package com.techlab.customerstatic;

public class Customer {
	
	private String id, name;
	private int order;
	private static int count = 1001;
	private static final char ID;
	
	static {	
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		StringBuilder str = new StringBuilder();
		int index = (int) (Math.random() * alpha.length());
//		str.append(alpha.charAt(index));
//		ID = str.toString();
		ID = alpha.charAt(index);
	}
	
	public Customer(String name, int order) {
		
		this.name = name;
		this.order = order;
		this.id = setId();
	}
	
	public String getName() {
		return name;
	}
	
	public int getOrder() {
		return order;
	}
	
	public String getID() {
		return id;
	}
	
	
	private String setId() {
		
		String x = Integer.toString(count);
		String accNum = ID + x;
		count++;
		return accNum;
	}
}
