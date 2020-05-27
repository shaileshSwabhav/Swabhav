package com.techlab.empsalary;

public class Developer extends Employee {

	private final double BONUS = (30.0 / 100.0);
	
	public Developer(int empId, String empName, float basicSalary) {
		super(empId, empName, basicSalary);
	}
		
	public double calculateSalary() {
		
		double grossSalary = basicSalary + (basicSalary * BONUS);
		return grossSalary;
	}
	
}
