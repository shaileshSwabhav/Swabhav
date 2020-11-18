package com.techlab.account.test;

import com.techlab.account.AccountWithException;
import com.techlab.account.InsufficientBalance;

public class AccountTestWithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccountWithException acc1 = new AccountWithException("xyz", 2000);
		AccountWithException acc2 = new AccountWithException("abc");
		AccountWithException acc3 = new AccountWithException("pqr", 1000);

		printInfo(acc1);
		printInfo(acc2);
		printInfo(acc3);

	}

	public static void printInfo(AccountWithException acc) {
		
		System.out.println("name: " + acc.getName());
		System.out.println("balance: " + acc.getBalance());
		System.out.println("accountNumber: " + acc.getAccountNumber());
		acc.deposit(1000);
		System.out.println("New Balance: " + acc.getBalance());
		
		try {
			acc.withdraw(2000);
			System.out.println("Amount Withdrawn. Balance left: " + acc.getBalance());
		} catch (InsufficientBalance e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}

		System.out.println();
		
	}

}
