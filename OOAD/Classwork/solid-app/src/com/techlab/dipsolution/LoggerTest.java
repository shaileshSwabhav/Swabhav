package com.techlab.dipsolution;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ILogable i1 = new XmlLogger();
		ILogable i2 = new TxtLogger();

		TaxCalculation tax1 = new TaxCalculation(i1);
		System.out.println(tax1.calculate(10, 5));
		System.out.println(tax1.calculate(0, 0));
		
		System.out.println();
		
		TaxCalculation tax2 = new TaxCalculation(i2);
		System.out.println(tax2.calculate(10, 5));
		System.out.println(tax2.calculate(0, 0));

		
	}

}
