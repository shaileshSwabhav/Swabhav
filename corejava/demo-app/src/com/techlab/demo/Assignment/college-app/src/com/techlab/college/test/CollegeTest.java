package com.techlab.college.test;

import com.techlab.college.*;

public class CollegeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Person p = new Person("CMO123", "21/312, qwdasd, qwdqwd, wqq", "2019-10-11");
		Student s = new Student("CMO345", "21/312, qwdasd, qwdqwd, wqq", "2010-05-22", "Computer");
		Professor pf = new Professor("CMO789", "21/312, qwdasd, qwdqwd, wqq", "2005-07-02", 1203.41);
	
		printPersonInfo(p);
		printStudentInfo(s);
		printProfessorInfo(pf);
		
	}

	public static void printPersonInfo(Person p) {
		
		System.out.println("id: " + p.getId());
		System.out.println("address: " + p.getAddress());
		System.out.println("date: " + p.getDate());
		System.out.println();		
	}
	
	public static void printStudentInfo(Student s) {

		System.out.println("id: " + s.getId());
		System.out.println("address: " + s.getAddress());
		System.out.println("date: " + s.getDate());
		System.out.println("branch: " + s.getBranch());
		System.out.println();		
		
	}
	
	public static void printProfessorInfo(Professor pf) {
		
		System.out.println("id: " + pf.getId());
		System.out.println("address: " + pf.getAddress());
		System.out.println("date: " + pf.getDate());
		System.out.println("salary: " + pf.getSalary());
		pf.calculateSalary(5);
		System.out.println("New Salary: " + pf.getSalary());
		System.out.println();		

	}
}
