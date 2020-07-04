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
		System.out.println("Max Salaried person is:\n" + maxSalariedPerson);
		
		HashSet<String> deptNoData = a.calulateTotalNumberofEmployee(30);
		System.out.println("DEPARTMENT");
		if(!deptNoData.isEmpty()) {
			for(String s: deptNoData) {
				System.out.println(s);
			}
		} else {
			System.out.println("Employees Not Found!");
		}
		
		HashSet<String> designationData = a.calulateTotalNumberofEmployee("clerk");
		System.out.println("DESIGNATION");
		if(!designationData.isEmpty()) {
			for(String s: designationData) {
				System.out.println(s);
			}
		} else {
			System.out.println("Employees Not Found!");
		}

		
	}

}
