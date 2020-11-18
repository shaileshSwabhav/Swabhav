package com.techlab.relation;

import java.util.ArrayList;

public class College {

	private int collegeID;
	private String collegeName;
	private ArrayList<Department> dept;

	public College(int collegeID, String collegeName, ArrayList<Department> dept) {
		this.collegeID = collegeID;
		this.collegeName = collegeName;
		this.dept = dept;
	}

	public int getCollegeID() {
		return collegeID;
	}

	public String getCollegeName() {
		return collegeName;
	}

	@Override
	public String toString() {
		String result = "College ID: " + getCollegeID() + " College Name: " + getCollegeName() + "\n";

		for (Department d : dept) {
			result += "\n" + d.toString();
		}

		return result;
	}

}
