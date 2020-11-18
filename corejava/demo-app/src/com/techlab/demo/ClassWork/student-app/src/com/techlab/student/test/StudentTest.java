package com.techlab.student.test;

import com.techlab.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(101, "xyz", 7.45, Student.Branch.CS);
		Student s2 = new Student(102, "abc", 6.54, Student.Branch.IT);
		Student s3 = new Student(101, "xyz", 7.45, Student.Branch.CS);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3.getBranch());

	}

}
