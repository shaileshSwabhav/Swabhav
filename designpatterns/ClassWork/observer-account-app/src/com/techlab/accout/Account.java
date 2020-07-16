package com.techlab.accout;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Account {
	
	private int accountNumber;
	private String accountName, date;
	private double balance ,amount;
	private ArrayList<IListner> listners = new ArrayList<IListner>();
	private boolean isDebited, isCredited;
	
	public Account(int accountNumber, String accountName, double balance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public boolean getIsDebited() {
		return isDebited;
	}
	
	public boolean getIsCredited() {
		return isCredited;
	}
	
	public void setDate() {
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    this.date = formatter.format(date);
	}
	
	public String getDate() {
		return date;
	}

	public void withdraw(int amount) {
		this.amount = amount;
		balance -= amount;
		this.isCredited = true;
		setDate();
		notifyListner();
		this.isCredited = false;
	}
	
	public void deposit(int amount) {
		this.amount = amount;
		balance += amount;
		this.isDebited = true;
		setDate();
		notifyListner();
		this.isDebited = false;
	}
	
	public void addListners(IListner listner) {
		listners.add(listner);
	}
	
	private void notifyListner() {
		
		for (IListner l: listners) {
			l.update();
		}
	}

}
