package com.techlab.serializable.test;

import java.io.*;
import java.util.ArrayList;

import com.techlab.serializable.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		ArrayList<Account> a = new ArrayList<Account>();
		

		a.add(new Account("abc", 10000));
		a.add(new Account("xyz", 20000));
		a.add(new Account("mno", 15000));
		a.add(new Account("def", 13000));

		a.get(0).deposit(1000);
		a.get(1).withdraw(2000);
		a.get(1).deposit(5000);
		a.get(2).withdraw(2000);
		a.get(3).deposit(1000);
		a.get(2).withdraw(1000);
		a.get(3).deposit(5000);
		
		*/
		
		Account [] a = new Account[5];
		
		a[0] = (new Account("abc", 10000));
		a[1] = (new Account("xyz", 20000));
		a[2] = (new Account("mno", 15000));
		a[3] = (new Account("def", 13000));

		a[0].deposit(1000);
		a[1].withdraw(2000);
		a[1].deposit(5000);
		a[2].withdraw(2000);
		a[3].deposit(1000);
		a[3].withdraw(1000);
		a[2].deposit(5000);

		a[4] = new Account("Jay", 12412);

//		storingAccountHolderDetails(a);
		retrivingAccountHolderDetails(a);

	}

	public static void storingAccountHolderDetails(Account[] a) {

		try {
			FileOutputStream file = new FileOutputStream("Account.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			for (Account a1 : a) {
				out.writeObject(a1);
			}
			out.close();

		} catch (Exception e) {
			System.out.println("Stroing Exception is caught: " + e);
		}

	}

	public static void retrivingAccountHolderDetails(Account [] a) {

		try {
			FileInputStream file = new FileInputStream("Account.txt");
			ObjectInputStream in = new ObjectInputStream(file);

			for (int i = 0; i < a.length; i++) {
//				a.set(i, (Account) in.readObject());
				a[i] = (Account) in.readObject();
				

				System.out.println("Account Number: " + a[i].getAccountNumber());
				System.out.println("Name: " + a[i].getName());
				System.out.println("Balance: " + a[i].getBalance());
				System.out.println("No of Transactions: " + a[i].getNoOfTransactions());
				System.out.println();
			}

			in.close();
		}

		catch (Exception ex) {
			System.out.println("Retriving Exception is caught: " + ex);
		}

	}

}
