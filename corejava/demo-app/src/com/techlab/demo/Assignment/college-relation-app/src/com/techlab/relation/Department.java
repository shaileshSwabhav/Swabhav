package com.techlab.relation;

import java.util.ArrayList;

public class Department {
	
	private int deptID;
	private String deptName;
	private ArrayList<Student> student;
	
	public Department(int deptID, String deptName, ArrayList<Student> student) {
		this.deptID = deptID;
		this.deptName = deptName;
		this.student = student;
	}
	
	public int getDeptID() {
		return deptID;
	}
	
	public String getDeptName() {
		return deptName;
	}
	
	public ArrayList<Student> getStudents() {
		return student;
	}
	
	@Override
	public String toString() {
		
		String result = "";
		for(Student s: student) {
			result += "Dept ID: " + getDeptID() + " Dept Name: " + getDeptName() + 
					s.toString() +  "\n";
		}
	
		return result;
		
	}

}
