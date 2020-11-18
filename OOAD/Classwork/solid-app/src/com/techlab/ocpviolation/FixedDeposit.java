package com.techlab.ocpviolation;

public class FixedDeposit {

	private int accNo, years;
	private String accName;
	private double principle;
	private FestivalType festival;
	
	public FixedDeposit(int accNo, String accName, double principle, int years, FestivalType festival) {
		this.accNo = accNo;
		this.years = years;
		this.accName = accName;
		this.principle = principle;
		this.festival = festival;
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

	public FestivalType getFestival() {
		return festival;
	}	
	
	public double calculateRate() {
		
		if (festival == FestivalType.Diwali) {
			return 15;
		} else if (festival == FestivalType.Holi) {
			return 10;
		} else {
			return 7;
		}
	}
	
	public double calculateSimpleInterest() {
		
		return (principle * years * calculateRate()) / 100.0 ;  
	}
	
}
