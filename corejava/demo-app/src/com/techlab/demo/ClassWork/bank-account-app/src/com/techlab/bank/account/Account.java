package com.techlab.bank.account;

public abstract class Account {

	private int accNum;
	private String name;
	private double balance;
	public boolean isAllowed = true;
	
	public Account(int accNum, String name, double balance) {
		this.accNum = accNum;
		this.name = name;
		this.balance= balance;
	}
	
	public abstract boolean withdraw(double amt);
	
	public void setBalance(double amt) {
		balance -= amt;
	}
	
	public int getAccNum() {
		return accNum;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		balance += amt;
	}
}
