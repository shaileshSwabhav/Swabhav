package com.techlab.ocpsolution;

public class FixedDeposit {

	private int accNo, years;
	private String accName;
	private double principle;
	private IFestivaleRate festivalName;

	public FixedDeposit(int accNo, String accName, double principle, 
			int years, IFestivaleRate festivalName) {
		this.accNo = accNo;
		this.years = years;
		this.accName = accName;
		this.principle = principle;
		this.festivalName = festivalName;
	}

	public int getAccNo() {
		return accNo;
	}

	public int getYears() {
		return years;
	}

	public String getAccName() {
		return accName;
	}

	public double getPrinciple() {
		return principle;
	}

	public IFestivaleRate getFestival() {
		return festivalName;
	}
	
	public double calculateSimpleInterest() {
		
		return (principle * years * festivalName.getRate()) / 100.0 ;  
	}


}
