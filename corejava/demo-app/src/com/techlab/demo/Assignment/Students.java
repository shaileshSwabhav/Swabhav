package com.techlab.demo.Assignment;

public class Students {

	private String name;
	private int rollNum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayOfObject Example

		Students[] s = new Students[2];

		s[0] = new Students();
		s[1] = new Students();

		s[0].setName("abc");
		s[0].setRollNum(101);
		System.out.println("Name: " + s[0].getName() + " Roll Number: " + s[0].getRollNum());

		s[1].setName("xyz");
		s[1].setRollNum(102);
		System.out.println("Name: " + s[1].getName() + " Roll Number: " + s[1].getRollNum());

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNum(int roll) {
		rollNum = roll;
	}

	public String getName() {
		return name;
	}

	public int getRollNum() {
		return rollNum;
	}

}

//how array of objects different from normal array?
