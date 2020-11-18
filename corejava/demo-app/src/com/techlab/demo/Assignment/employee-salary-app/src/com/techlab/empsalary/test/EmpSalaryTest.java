package com.techlab.empsalary.test;

import java.lang.reflect.Field;

import com.techlab.empsalary.*;

public class EmpSalaryTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Employee e1 = new Developer(101, "abc", 10000);
		Employee e2 = new Analyst(102, "mno", 10000);
		Employee e3 = new Manager(103, "xyz", 10000);
		
		printInfo(e1);
		printInfo(e2);
		printInfo(e3);
		
	}

	public static void printInfo(Employee e) throws Exception {
		
		System.out.println("----------------" + e.getClass().getSimpleName() + " Info" + "----------------");
		System.out.println("ID: " + e.getId());
		System.out.println("Name: " + e.getName());
		System.out.println("Basic Salary: " + e.getBasicSalary());
		printField(e);
		System.out.println("Gross Salary: " + e.calculateSalary());
		System.out.println();
		
	}
	
	public static void printField(Employee e) throws Exception {
		
		Field[] field = e.getClass().getDeclaredFields();
		for(Field f: field) {
			f.setAccessible(true);
			System.out.println(f.getName() + ": " + (int)(f.getDouble(e) * 100) + "%");
		}
		
	}
}
