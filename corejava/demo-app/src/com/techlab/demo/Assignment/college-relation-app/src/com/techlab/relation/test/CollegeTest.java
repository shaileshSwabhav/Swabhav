package com.techlab.relation.test;

import java.util.ArrayList;

import com.techlab.relation.*;

public class CollegeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ArrayList<Student> studentsFromIT = new ArrayList<Student>();
		ArrayList<Student> studentsFromCOMPS = new ArrayList<Student>();
		ArrayList<Student> studentsFromEXTC = new ArrayList<Student>();

		
		studentsFromIT.add(new Student(101, "sam", "21-02-1998", "Mumbai"));
		studentsFromIT.add(new Student(102, "ben", "06-07-1999", "Nagpur"));
		studentsFromCOMPS.add(new Student(103, "tom", "15-03-2000", "Pune"));
		studentsFromCOMPS.add(new Student(104, "ram", "02-02-1997", "Nashik"));
		studentsFromEXTC.add(new Student(105, "john", "15-06-2002", "Pune"));
		studentsFromEXTC.add(new Student(106, "ulrich", "02-12-2001", "Nashik"));
		
		ArrayList<Department> dept = new ArrayList<Department>();
		
		dept.add(new Department(2001, "IT", studentsFromIT));
		dept.add(new Department(2002, "COMPS", studentsFromCOMPS));
		dept.add(new Department(2003, "EXTC", studentsFromEXTC));
		
		College c = new College(1501, "SSJCOE", dept);
		
		printCollegeInfo(c);
		
	}
	
	public static void printCollegeInfo(College c) {
		
		System.out.println(c);
	}

}
