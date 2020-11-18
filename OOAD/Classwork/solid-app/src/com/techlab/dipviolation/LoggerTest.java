package com.techlab.dipviolation;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TaxCalculation tax = new TaxCalculation(LogType.XML);
		System.out.println(tax.calculate(10, 5));
		System.out.println(tax.calculate(0, 0));
		
	}

}
