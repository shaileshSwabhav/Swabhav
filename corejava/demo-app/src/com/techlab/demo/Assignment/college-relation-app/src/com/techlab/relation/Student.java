package com.techlab.relation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
	
	private int studentID;
	private String studentName, studentAddress;
	private Date dateOfBirth;
	
	public Student(int studentID, String studentName, String dateOfBirth, String studentAddress) throws Exception {
		this.studentID = studentID;
		this.studentName = studentName;
		this.dateOfBirth = setDate(dateOfBirth);
		this.studentAddress = studentAddress;
	}
	
	private Date setDate(String dob) throws Exception {
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Date date = s.parse(dob);
		
		return date;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	
	@Override
	public String toString() {
		return "Student ID: " + getStudentID() + " Student Name: " + getStudentName() + "\n"; 
	}
}
