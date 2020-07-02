package com.techlab.employee.test;

import java.util.*;

import com.techlab.employee.*;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Parser p = new Parser(new FileLoader());
		p.parseFile("src/resource/dataFile_emp.txt");
		
//		Parser p = new Parser(new URLLoader());
//		p.parseFile("https://swabhav-tech.firebaseapp.com/emp.txt");
			
		Analyzer a = new Analyzer(p);
		String maxSalariedPerson = a.calculateMaximumSalariedPerson();
		System.out.println("Max Salaried person: " + maxSalariedPerson);
		
		HashSet<String> deptNoData = a.calulateTotalNumberofEmployee(20);
		if(!deptNoData.isEmpty()) {
			System.out.println("DEPARTMENT");
			for(String s: deptNoData) {
				System.out.println(s);
			}
		} else {
			System.out.println("Employees Not Found!");
		}
		
		HashSet<String> designationData = a.calulateTotalNumberofEmployee("clerk");
		if(!designationData.isEmpty()) {
			System.out.println("DESIGNATION");
			for(String s: designationData) {
				System.out.println(s);
			}
		} else {
			System.out.println("Employees Not Found!");
		}

		
	}

}
