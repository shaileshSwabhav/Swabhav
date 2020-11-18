package com.techlab.candidate.test;

import com.techlab.candidate.Candidate;

public class CandidateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Candidate c1 = new Candidate(12, "xyz", 20, "B");
		Candidate c2 = new Candidate(15, "abc", 22, "A");
		
//		c1.setID(12);
//		c1.setAge(20);
//		c1.setName("xyz");
//		c1.setCreditPoint("B");
//		
//		c2.setID(15);
//		c2.setAge(22);
//		c2.setName("abc");
//		c2.setCreditPoint("A");
		
		c1.whoIsBetter(c2);
		if(!(c1.isBetter)) {
			System.out.println(c2.getName() + " is better than " + c1.getName());
		} else {
			System.out.println(c1.getName() + " is better than " + c2.getName());
		}
		
//		c1.whoIsElder(c2);
		printInfo(c1);
		printInfo(c2);
		
	}
	
	public static void printInfo(Candidate c) {
		
		System.out.println("Id: " + c.getId());
		System.out.println("Name: " + c.getName());
		System.out.println("Age: " + c.getAge());
		System.out.println("Credit Point: " + c.getCreditPoint());
		System.out.println();
	}

}
