package com.techlab.bank.account.test;

import com.techlab.bank.account.*;

public class AccounTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount a1 = new SavingAccount(101, "abc", 50.0);
		Account a2 = new CurrentAccount(102, "abc", 100.21);
		
		printInfo(a1);
		printInfo(a2);		
		
	}

	
	public static void printInfo(Account a) {
		
		System.out.println(a.getAccNum());
		System.out.println(a.getName());
		System.out.println(a.getBalance());
		a.deposit(500);
		if(a.withdraw(500)) {
			System.out.println("Withdraw Successful. Available Balance: " + a.getBalance());
		} else {
			System.out.println("Insufficient Balance");
		}
		
		System.out.println();
	}
}
