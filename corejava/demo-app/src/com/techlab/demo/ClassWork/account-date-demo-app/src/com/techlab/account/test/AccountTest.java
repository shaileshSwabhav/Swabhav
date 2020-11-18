package com.techlab.account.test;

import java.util.Date;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Account[] accountHolders = new Account[4];

		accountHolders[0] = new Account("xyz", 5000, "2019-10-22", "2019-10-22");
		accountHolders[1] = new Account("abc", 4000, "2018-10-22", "2019-10-22");
		accountHolders[2] = new Account("mno", 3000, "2017-10-22", "2019-10-22");
		accountHolders[3] = new Account("pqr", 2000, "2019-05-22", "2019-10-22");

		Account accRich = findRichAccountHolder(accountHolders);
		Account accYoung = findYoungAccountHolder(accountHolders);

		
		System.out.println("Rich Account Holder");
		printInfo(accRich);
		System.out.println("Young Account Holder");
		printInfo(accYoung);
	}

	public static Account findRichAccountHolder(Account[] accountHolders) {

		Account acc = accountHolders[0];
		double balance = acc.getBalance();

		for (int i = 1; i < accountHolders.length - 1; i++) {
			if (balance < accountHolders[i].getBalance()) {
				balance = accountHolders[i].getBalance();
				acc = accountHolders[i];
			}
		}

		return acc;

	}

	public static Account findYoungAccountHolder(Account[] accountHolders) {

		Account acc = accountHolders[0];
		Date date = accountHolders[0].getCreationDate();

		for (int i = 1; i < accountHolders.length - 1; i++) {
			if (date.after(accountHolders[i].getCreationDate())) {
				date = accountHolders[i].getCreationDate();
				acc = accountHolders[i];
			}
		}
		return acc;	
	}
	
	public static boolean compareDate(Date d1, Date d2) {	
		boolean result = false;

		return result;
		
	}
	
	public static void printInfo(Account a) {
		
		
		System.out.println("Name: " + a.getName());
		System.out.println("Account Number: " + a.getAccountNumber());
		System.out.println("Balance: " + a.getBalance());
		System.out.println("Creation Date: " + a.getCreationDate());
		System.out.println("Date of birth: " + a.getDateOfBirth());
		System.out.println();
	}
}
