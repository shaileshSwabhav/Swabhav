package com.techlab.account;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {

	private double balance;
	private String name, accountNumber;
	private static final double MINIMUM_BALANCE = 500;
	public boolean CAN_WITHDRAW = false;
	private static int x = 1;

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

		String alphaNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int x = 10;
		StringBuilder str = new StringBuilder(x);

		for (int i = 0; i < x; i++) {
			int index = (int) (Math.random() * alphaNum.length());
			str.append(alphaNum.charAt(index));
		}
		return str.toString();
	}

	public void deposit(double balance) {
		this.balance += balance;
	}

	public void withdraw(double amt) {

		if ((balance - amt) > 500) {
			balance -= amt;
			CAN_WITHDRAW = true;
		}

	}

}
