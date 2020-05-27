package com.techlab.empsalary;

public class Analyst extends Employee {

	private final double PERK = (20.0 / 100.0); 
	
	public Analyst(int empId, String empName, float basicSalary) {
		super(empId, empName, basicSalary);
	}
	
	public double calculateSalary() {
		
		double grossSalary = basicSalary + (basicSalary * PERK);
		return grossSalary;
	}
	
}
