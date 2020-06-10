package com.techlab.shoppingcart;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Customer implements Serializable {

	private int customerId;
	private String customerName, customerAddress;
	private Date purchaseDate;
	private final static String FILENAME = "src/resource/ShoppingCart.txt";

	public Customer(int customerId, String customerName, String purchaseDate, String address) throws Exception {
		this.customerId = customerId;
		this.customerName = customerName;
		this.purchaseDate = setDate(purchaseDate);
		this.customerAddress = address;
	}

	private Date setDate(String purchaseDate) throws Exception {

		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date date = s.parse(purchaseDate);
		return date;
	}

	public void addIntoCart(HashMap<Customer, ArrayList<Product>> map) throws Exception {

		FileOutputStream file = new FileOutputStream(FILENAME);
		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(map);

		out.flush();
		out.close();
	}

	public ArrayList<Product> searchFromCart(ArrayList<Product> product, String productName) throws Exception {

		ArrayList<Product> p = new ArrayList<Product>();
		boolean contactFound = false;

		for (int i = 0; i < product.size(); i++) {
			if (product.get(i).getProductName().equals(productName)) {
				p.add(product.get(i));
				contactFound = true;
			}
		}
		
		if (!contactFound) {
			throw new ContactNotFoundException();
		}
		return p;
	}

	public void deleteFromCart(ArrayList<Product> product, String productName) throws Exception {

		boolean contactFound = false;

		for (int i = 0; i < product.size(); i++) {
			if (product.get(i).getProductName().equals(productName)) {
				product.remove(i);
			}
		}
		
		if (!contactFound) {
			throw new ContactNotFoundException();
		}
		
	}

	public static HashMap<Customer, ArrayList<Product>> deserializeCustomer() throws Exception {

		HashMap<Customer, ArrayList<Product>> map;
		FileInputStream file = new FileInputStream(FILENAME);
		ObjectInputStream in = new ObjectInputStream(file);

		map = (HashMap<Customer, ArrayList<Product>>) in.readObject();

		in.close();
		return map;
	}

	public double totalCartCost(ArrayList<Product> product) {
		double total = 0;
		
		for(Product p: product) {
			total = total + p.getUnitPrice() - (p.getDiscount() * p.getUnitPrice());
		}
		
		return total;		
	}
	
	public int getID() {
		return customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	
	public String getCustomerAddress() {
		return customerAddress;
	}
	
//	@Override
//	public int hashCode() {
//		return customerId;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;
//		Customer c = (Customer) obj;
//		
//		if(this.customerId == c.customerId && this.customerName.equals(c.customerName)
//				&& this.purchaseDate.compareTo(c.purchaseDate) == 0 && this.address.equals(c.address)) {
//			result = true;
//		}
//		
//		return result;
//	}

}
