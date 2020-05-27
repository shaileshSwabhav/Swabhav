package com.techlab.empsalary;

public class Manager extends Employee {

	private final double HRA = (50.0 / 100.0), TA = (40.0 / 100.0), DA = (30.0 / 100.0);
	
	public Manager(int empId, String empName, float basicSalary) {
		super(empId, empName, basicSalary);
	}
	
	public double calculateSalary() {
		
		double grossSalary = basicSalary + (basicSalary * HRA)  + (basicSalary * TA) + (basicSalary * DA);
		return grossSalary;
	}
}
