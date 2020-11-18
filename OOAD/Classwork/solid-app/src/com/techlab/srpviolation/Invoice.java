package com.techlab.srpviolation;

public class Invoice {

	private int invoiceNum;
	private String name;
	private double amount, discountPrectnage;
	private final float GST = 18f;
	
	public Invoice(int invoiceNum, String name, double amount, 
			double discountPrectnage) {
		this.invoiceNum = invoiceNum;
		this.name = name;
		this.amount = amount;
		this.discountPrectnage = discountPrectnage;
	}

	public int getInvoiceNum() {
		return invoiceNum;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public double getDiscountPrectnage() {
		return discountPrectnage;
	}

	public double calculateDiscount() {
		
		return (amount * (discountPrectnage / 100.0));
	}
	
	public double calculateGST() {
		
		return (amount * GST / 100f);
	}
	
	public double calculateTotalCost() {
		
		return amount - calculateDiscount() + calculateGST();
	}
	
	public void printToConsole(Invoice v) {
		System.out.println(v);
	}

	@Override
	public String toString() {
		return "Invoice [invoiceNum= " + invoiceNum + "\nname=" + name + "\namount=" + amount + "\ndiscountPrectnage="
				+ discountPrectnage + "\ncalculateDiscount()=" + calculateDiscount() + "\ncalculateGST()="
				+ calculateGST() + "\ncalculateTotalCost()=" + calculateTotalCost() + "]";
	}
	
}
