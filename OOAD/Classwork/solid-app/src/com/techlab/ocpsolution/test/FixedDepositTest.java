package com.techlab.ocpsolution.test;

import com.techlab.ocpsolution.DiwaliRate;
import com.techlab.ocpsolution.FixedDeposit;
import com.techlab.ocpsolution.IFestivaleRate;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IFestivaleRate d = new DiwaliRate();
		FixedDeposit f = new FixedDeposit(101, "ben", 1000.0, 5, d);
		
		printAccountInfo(f);
	}

	public static void printAccountInfo(FixedDeposit f) {
		
		System.out.println("Acc Num: " +f.getAccNo() 
		+ "\nAcc Name: " +f.getAccName()
		+"\nPrinciple: " + f.getPrinciple()
		+ "\nYears: " + f.getYears()
		+ "\nSimple Interest: " + f.calculateSimpleInterest());
	}
	
}
