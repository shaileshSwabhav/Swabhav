package com.techlab.serializable;

import java.io.Serializable;

public class Account implements Serializable {

	private double balance;
	private String name, accountNumber;
	private static final double MINIMUM_BALANCE = 500;
	public boolean CAN_WITHDRAW = false;
	private static int num = 1001;
	private int noOfTranscations = 0;
	private static String ID;
	
	static {
		ID = "SBI";
	}

	// Constructors
	public Account(String name, double amount) {
		this.name = name;
		this.balance = amount;
		this.accountNumber = setAccountNumber();
		}
	public Account(String name) {
		this(name, MINIMUM_BALANCE);
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	private String setAccountNumber() {
		String accNum = ID + Integer.toString(num);
		num++;
		return accNum;
	}
	
	public int getNoOfTransactions() {
		return noOfTranscations;
	}

	public void deposit(double balance) {
		this.balance += balance;
		noOfTranscations++;
	}
	
	public void withdraw(double amt) {

		if ((balance - amt) > 500) {
			balance -= amt;
			CAN_WITHDRAW = true;
			noOfTranscations++;
		}

	}
}
