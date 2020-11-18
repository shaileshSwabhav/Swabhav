package com.techlab.organization;

import java.util.ArrayList;

public class Partner {

	private int partnerID, empStrength;
	private String partnerName;
	private double companyTurnOver;
	private ArrayList<Talent> talent = new ArrayList<Talent>();

	public Partner(int partnerID, String partnerName, double companyTurnOver, int empStrength) {

		this.partnerID = partnerID;
		this.partnerName = partnerName;
		this.companyTurnOver = companyTurnOver;
		this.empStrength = empStrength;
	}

	public int getPartnerID() {
		return partnerID;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public double getCompayTurnOver() {
		return companyTurnOver;
	}

	public int getEmployeeStrength() {
		return empStrength;
	}

	public void addTalent(Talent t) {
		if (t.getPartner().equals(this.partnerName)) {
			this.talent.add(t);
		}
	}

	@Override
	public String toString() {
		String result = "";

		result += "Partner ID: " + getPartnerID() + "\nPartner Name: " + getPartnerName()
				+ "\nCompany Turn Over: " + getCompayTurnOver() + "\n";
		
		for(Talent t: talent) {
			result += "\n" +  t.toString();
		}
		
		return result;
	}

}
