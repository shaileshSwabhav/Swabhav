package com.techlab.organization;

public class Talent {

	private int talentID;
	private String talentName, partner;
	private double cgpa;

	public Talent(int talentID, String talentName, double cgpa, String partner) {
		this.talentID = talentID;
		this.talentName = talentName;
		this.cgpa = cgpa;
		this.partner = partner;
	}

	public int getTalentID() {
		return talentID;
	}

	public String getTalentName() {
		return talentName;
	}

	public double getCGPA() {
		return cgpa;
	}

	public String getPartner() {
		return partner;
	}
	
	@Override
	public String toString() {
		String result = "";		
		result += "ID: " + getTalentID() + "\nName: " + getTalentName() +
				"\nCGPA: " + getCGPA() + "\nPartner Name: " + getPartner() + "\n";
		
		return result;
	}

}
