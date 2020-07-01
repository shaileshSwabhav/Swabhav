package com.techlab.employee.test;

import java.io.*;
import java.util.*;

import com.techlab.employee.*;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ILoadable load = new FileLoader();
		File file = load.loadFile("src/resource/dataFile_emp.txt");
		
		ILoadable web = new URLLoader();
		File webFile = web.loadFile("https://swabhav-tech.firebaseapp.com/emp.txt");
		
		Parser p = new Parser();
		HashSet<String> empData = p.parseFile(file);
//		HashSet<String> empData = p.parseFile(webFile);
			
		Analyzer a = new Analyzer();
		String maxSalariedPerson = a.calculateMaximumSalariedPerson(empData);
		System.out.println("Max Salaried person: " + maxSalariedPerson);
		
		HashSet<String> deptNoData = a.calulateTotalNumberofEmployee(empData, 20);
		if(!deptNoData.isEmpty()) {
			System.out.println("DEPARTMENT");
			for(String s: deptNoData) {
				System.out.println(s);
			}
		} else {
			System.out.println("Employees Not Found!");
		}
		
		HashSet<String> designationData = a.calulateTotalNumberofEmployee(empData, "clerk");
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
