package com.techlab.srpsolution.test;

import com.techlab.srpsolution.*;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice v = new Invoice(101, "ben", 100.0, 10);
		PrintInvoice p = new PrintInvoice();
		
		p.InvoicePrinter(v);
		
	}

}
