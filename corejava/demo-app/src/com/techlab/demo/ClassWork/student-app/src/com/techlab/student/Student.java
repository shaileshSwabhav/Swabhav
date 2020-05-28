package com.techlab.student;


public class Student {
	
	private int id;
	private String name; 
	Branch branch;
	private double cgpa;
	
	public enum Branch {
		CS, IT, CHEMICAL, MECHANICAL, PRODUCTION;
	}
	
	public Student(int id, String name, double cgpa, Branch branch) {
		
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.branch = branch;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCgpa() {
		return cgpa;
	}
	
	public String getBranch() {
		return branch.toString();
	}
	
	@Override
	public int hashCode() { 
		return id;
	}
	
	@Override
	public String toString() {
		return "The id and name of student is: " + getId() + " and " + getName();
	}
	
	@Override
	public boolean equals(Object obj) {	
	Student s = (Student) obj;
	if (id == s.id && name.equals(s.name)) {
		return true;
	} else {
		return false;
	}
		
	}
}
