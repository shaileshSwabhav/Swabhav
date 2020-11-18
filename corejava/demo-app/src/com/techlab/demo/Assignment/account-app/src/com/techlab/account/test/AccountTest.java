package com.techlab.account.test;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc1 = new Account("xyz", 2000);
		Account acc2 = new Account("abc");
		Account acc3 = new Account("pqr", 1000);
		
		printInfo(acc1);
		printInfo(acc2);
		printInfo(acc3);
		
	}

	public static void printInfo(Account acc) {
		
		System.out.println("name: " + acc.getName());
		System.out.println("balance: " + acc.getBalance());
		System.out.println("accountNumber: " + acc.getAccountNumber());
		acc.deposit(1000);
		System.out.println("New Balance: " + acc.getBalance());
		acc.withdraw(1500);
		if(acc.CAN_WITHDRAW) {
			System.out.println("Amount Withdrawn. Balance left: " + acc.getBalance());
		} else {
			System.out.println("Insufficient Balance");
		}
		System.out.println();
		
	}
	
}
