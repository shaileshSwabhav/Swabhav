package com.techlab.staticmethod.test;

public class StaticMethodTest {
	
	private int id, age;
	private String name;
	
	public StaticMethodTest(int id, String name, int age) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticMethodTest s1 = new StaticMethodTest(101, "abc", 21);
		StaticMethodTest s2 = new StaticMethodTest(102, "xyz", 22);
		StaticMethodTest s3 = new StaticMethodTest(103, "pqr", 23);
		
		printInfo(s1);
		printInfo(s2);
		printInfo(s3);
		
	}
	
	public static void printInfo(StaticMethodTest s) {
		
		System.out.println("ID: " + s.id);
		System.out.println("Name: " + s.name);
		System.out.println("Age: " + s.age);
		System.out.println();
		
	}

}
