package com.techlab.shoppingcart;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerializeCustomer implements Serializable {

	private final static String FILENAME = "src/resource/Cart.txt";

	
	public void serializeCustomer(ArrayList<Customer> cust) throws Exception {
		
		FileOutputStream file = new FileOutputStream(FILENAME);
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		out.writeObject(cust);
		
		out.flush();
		out.close();
	}
	
	public ArrayList<Customer> deserializeCustomer() throws Exception {
		
		ArrayList<Customer> cust;
		
		FileInputStream file = new FileInputStream(FILENAME);
		ObjectInputStream in = new ObjectInputStream(file);
		
		cust = (ArrayList<Customer>) in.readObject();
		
		in.close();
		
		return cust;
	}

	
}
