package com.techlab.student;

public class Student {

	private int id;
	private String name;
	private float cgpa;
	private static int countOfInstances;

	static {
		int countOfInstances = 0;
		System.out.println("We are in static block");
	}

	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		countOfInstances++;
		System.out.println("We are in constructor");
	}

	public int getCount() {
		return countOfInstances;
	}

	public static int headCount() {
		return countOfInstances;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		case 1
//		Student s1 = new Student(22, "abc", 8.5f);
//		System.out.println(s1.getCount());
//
//		Student s2 = new Student(22, "abc", 8.5f);
//		System.out.println(s1.getCount());
//
//		Student s3 = new Student(22, "abc", 8.5f);
//		System.out.println(s1.getCount());

		/*
		 * static block runs only once when class is loaded into the memory and
		 * constructor runs every time when object is created so the count increases 
		 * as it is static
		 * 
		 */

//		case 2

//		Student s7 = new Student(22, "abc", 8.5f);
//		System.out.println(s7.getCount());
//
//		Student s8 = new Student(22, "abc", 8.5f);
//		System.out.println(s8.getCount());
//
//		Student s9 = new Student(22, "abc", 8.5f);
//		System.out.println(s9.getCount());

		/*
		 * count increases as it is static constructor block runs every time obj is
		 * created
		 */

//		case 3

		Student s4 = new Student(22, "sona", 8.5f);

		Student s5 = new Student(22, "Saloni", 9.23f);

		Student s6 = new Student(22, "Raju", 1.3f);

		System.out.println("Head count = " + Student.headCount());// s1.headCount()??//same output???
		
//		Student.

		/*
		 * 1. main
		 * 2. class
		 * 3. countOfInstances
		 * 4. headCount
		 */

		/*
		 * same output as countOfInstance is incremented by 1 when the constructor is
		 * called
		 */

	}

}
