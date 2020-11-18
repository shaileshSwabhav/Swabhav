package com.techlab.contact;

import java.io.Serializable;

public class Contact implements Serializable {

	private String firstName, lastName, emailID;
	private long phoneNo;
	
	public Contact() {
		
	}
	
	public Contact(String firstName, String lastName, long phoneNo, String emailID) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.emailID = emailID;
	}
	
	public void setFirstName(String newName) {
		this.firstName = newName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getEmailID() {
		return emailID;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}
}
