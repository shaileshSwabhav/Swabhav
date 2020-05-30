package com.techlab.crudable.test;

import com.techlab.crudable.*;

public class CrudableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddressDb a = new AddressDb();
		CustomerDb c = new CustomerDb();
		InvoiceDb i = new InvoiceDb();
		
		printInfo(a);
		printInfo(c);
		printInfo(i);
		
	}

	public static void printInfo(ICrudable ic) {
		ic.create();
		ic.read();
		ic.update();
		ic.delete();
		System.out.println();
	}
}
