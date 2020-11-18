package com.techlab.bank.account;

public class CurrentAccount extends Account {

	private final double MINIMUM_BALANCE = 1000; 

	
	public CurrentAccount(int accNum, String name, double balance) {
		super(accNum, name, balance);
	}

	@Override
	public boolean withdraw(double amt) {
		
		if ((getBalance() - amt) > MINIMUM_BALANCE) {
			super.setBalance(amt);
			return isAllowed;
		} else {
			return (!isAllowed);
		}
		
	}

	
}
