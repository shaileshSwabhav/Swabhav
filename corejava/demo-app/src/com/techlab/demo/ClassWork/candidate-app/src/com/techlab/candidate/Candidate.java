package com.techlab.candidate;

public class Candidate {

	private int id, age;
	private String name, creditPoint;
	public boolean isBetter = false;

	public Candidate(int setId, String setName, int setAge, String setCreditPoint) {
		id = setId;
		name = setName;
		age = setAge;
		creditPoint = setCreditPoint;		
	}

	public void setID(int setId) {
		id = setId;
	}

	public void setAge(int setAge) {
		age = setAge;
	}

	public void setName(String setName) {
		name = setName;
	}

	public void setCreditPoint(String cp) {
		creditPoint = cp;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getCreditPoint() {
		return creditPoint;
	}
	
	public void whoIsBetter(Candidate c) {
		int res = creditPoint.compareToIgnoreCase(c.creditPoint);
		if (res < 0) {
			isBetter = true;
		} 
	}


//	public void whoIsElder(Candidate c) {
//		if (this.age < c.age) {
//			age = c.age;
//		}
//	}

}
