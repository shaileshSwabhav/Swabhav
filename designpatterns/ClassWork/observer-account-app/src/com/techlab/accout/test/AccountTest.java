package com.techlab.accout.test;

import com.techlab.accout.*;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc1 = new Account(101, "sam", 5000.0);
		acc1.addListners(new EmailListner(acc1));
		acc1.addListners(new SmsListner(acc1));
		
		Account acc2 = new Account(102, "tom", 2000.0);
		acc2.addListners(new SmsListner(acc2));
		
		acc1.withdraw(100);
		acc2.deposit(1000);
		
	}

}
