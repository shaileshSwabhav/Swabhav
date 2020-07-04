package com.techlab.employee;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	
	private int empID, manageID, deptNumber;
	private String empName, empDesignation, dateOfJoining;
	private double salary, commission;
	
	public Employee(String empID, String empName, String empDesignation, String manageID, String dateOfJoining,
			String salary, String commission, String deptNumber) throws Exception {
		this.empID = Integer.parseInt(empID);
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.manageID = Integer.parseInt(manageID);
		setDateOfJoining(dateOfJoining);
		this.salary = Integer.parseInt(salary);
		setCommission(commission);
		this.deptNumber = Integer.parseInt(deptNumber);
	}

	public int getEmpID() {
		return empID;
	}

	public int getManageID() {
		return manageID;
	}

	public int getDeptNumber() {
		return deptNumber;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		if (commission.equals("NULL")) {
			this.commission = Double.parseDouble(commission);
		} else {
			this.commission = 0.0;
		}
	}
	
	public void setDateOfJoining(String dateOfJoining) throws Exception {
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date d = s.parse(dateOfJoining);
		String date = s.format(d);
		
		this.dateOfJoining = date;
	}
	
	

}
