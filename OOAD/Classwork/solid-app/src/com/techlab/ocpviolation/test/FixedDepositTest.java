package com.techlab.ocpviolation.test;

import com.techlab.ocpviolation.*;

public class FixedDepositTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FixedDeposit f = new FixedDeposit(101, "ben", 1000.0, 5, 
				FestivalType.Holi);
		
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
