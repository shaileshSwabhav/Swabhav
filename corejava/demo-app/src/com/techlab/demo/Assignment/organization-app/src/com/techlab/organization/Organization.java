package com.techlab.organization;

import java.text.SimpleDateFormat;
import java.util.*;

public class Organization {

	private int orgID;
	private String orgname;
	private Date registrationDate;
	private ArrayList<Talent> talent = new ArrayList<Talent>();
	private ArrayList<Partner> partner;

	public Organization(int orgID, String name, String registrationDate, ArrayList<Partner> partner) throws Exception {

		this.orgID = orgID;
		this.orgname = name;
		this.registrationDate = setDate(registrationDate);
		this.partner = partner;
	}

	private Date setDate(String registrationDate) throws Exception {
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		Date date = s.parse(registrationDate);

		return date;
	}

	public int getOrganizationID() {
		return orgID;
	}

	public String getOrganizationName() {
		return orgname;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void addTalent(Talent talent) {
		this.talent.add(talent);
	}

	public int getPartnerCount() {
		return partner.size();
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += "Organization ID: " + getOrganizationID() + "\nOrganization Name: " + getOrganizationName() +
				"\nRegistration Date: " + getRegistrationDate() + "\n\n";
		
//			result += "\nPartners Are";
		
		for (Talent t: talent) {
			result += t.toString();
		}
		
		return result;
	}
}
