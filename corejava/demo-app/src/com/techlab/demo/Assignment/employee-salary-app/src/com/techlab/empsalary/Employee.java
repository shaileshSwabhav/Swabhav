package com.techlab.empsalary;

public abstract class Employee {

	private int empId;
	private String empName;
	protected float basicSalary;
	
	public Employee(int empId, String empName, float basicSalary) {
		
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}
	
	public abstract double calculateSalary();
	
	public int getId() {
		return empId;
	}
	
	public String getName() {
		return empName;
	}
	
	public float getBasicSalary() {
		return basicSalary;
	}
	
}
