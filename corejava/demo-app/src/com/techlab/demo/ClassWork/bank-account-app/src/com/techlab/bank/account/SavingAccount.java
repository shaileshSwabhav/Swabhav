package com.techlab.bank.account;

public class SavingAccount extends Account {

	private final double MINIMUM_BALANCE = 500; 
	
	public SavingAccount(int accNum, String name, double balance) {
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
