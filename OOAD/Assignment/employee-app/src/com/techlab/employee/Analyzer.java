package com.techlab.employee;

import java.util.*;

public class Analyzer {

	public String calculateMaximumSalariedPerson(HashSet<String> empData) {

		final int SALARY_INDEX = 5;
		final int COMISSION_INDEX = SALARY_INDEX + 1;
		int salary = 0;

		String maxSalariedPerson = "";
		String[] employee = null;
		int maximumSalary = 0;

		for (String e : empData) {
			employee = e.split(",", e.length());
			salary = Integer.parseInt(employee[SALARY_INDEX]);
			if (employee[COMISSION_INDEX].equals("NULL")) {
			} else {
				salary += Integer.parseInt(employee[COMISSION_INDEX]);
			}

			if (maximumSalary < salary) {
				maximumSalary = salary;
				maxSalariedPerson = e;
			}
		}

		return maxSalariedPerson;
	}

	public HashSet<String> calulateTotalNumberofEmployee(HashSet<String> empData, int deptNumber) {

		HashSet<String> departmentData = new HashSet<String>();
		String[] employee = null;
		final int DEPT_INDEX = 7;
		
		for(String e: empData) {
			employee = e.split(",", e.length());
						
			if(deptNumber == Integer.parseInt(employee[DEPT_INDEX])) {
				departmentData.add(e);
			}
		}

		return departmentData;
	}
	
	public HashSet<String> calulateTotalNumberofEmployee(HashSet<String> empData, String designation) {
		
		HashSet<String> departmentData = new HashSet<String>();
		String[] employee = null;
		final int DESIGNATION_INDEX = 2;
		
		for(String e: empData) {
			employee = e.split(",", e.length());
			if(designation.equalsIgnoreCase(employee[DESIGNATION_INDEX].replace("'", ""))) {
				departmentData.add(e);
			}
		}

		return departmentData;
	}

}
