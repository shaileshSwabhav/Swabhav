package com.techlab.person.test;

import com.techlab.person.Person;

public class PersonTest {

	public static void main(String [] args) {

		Person p1 = new Person("xyz", "null", -2.4f, 100.0f);
		Person p2 = new Person("abc", -21, "female", 2.7f, -163.6f);
		
		printInfo(p1);
		printInfo(p2);
	}

	public static void printInfo(Person p) {
		
		System.out.println("Name: " + p.getName());
		System.out.println("Age: " + p.getAge());
		System.out.println("Gender: " + p.getGender());
		System.out.println("Height: " + p.getHeight());
		System.out.println("Weight: " + p.getWeight());
		p.calculateBMI();
		if (p.getBMI() < 18.0) {
			System.out.println("Under Weight: " + p.getBMI());
		} else if (p.getBMI() > 18.0 && p.getBMI() > 25) {
			System.out.println("Normal Weight: " + p.getBMI());
		} else {
			System.out.println("Over Weight:" + p.getBMI());
		}
		
		p.doWorkOut();
		System.out.println("after workout: " + p.getWeight());
		System.out.println();

		
	}
}