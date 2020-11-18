package com.techlab.srpsolution;

public class PrintInvoice {
	
	private Invoice invoice; 
	
	public void InvoicePrinter(Invoice invoice) {
		System.out.println("Invoice Number: " + invoice.getInvoiceNum()
		+ "\nName: " + invoice.getName() + "\nAmount: " + invoice.getAmount()
		+ "\nDiscount Prectnage: " + invoice.getDiscountPrectnage()
		+ "\nGST: " + invoice.calculateGST()
		+ "\nTotal Cost: " + invoice.calculateTotalCost());
	}
	
	public void printToConsole() {
		
	}

}
