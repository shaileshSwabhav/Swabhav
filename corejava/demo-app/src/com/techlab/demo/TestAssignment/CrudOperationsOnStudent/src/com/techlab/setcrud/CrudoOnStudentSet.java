package com.techlab.setcrud;

import java.util.HashSet;

import com.techlab.student.Student;

public class CrudoOnStudentSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> arr = new HashSet<Student>();

		addNewStudent(arr, new Student(1, "Steve"));
		addNewStudent(arr, new Student(2, "David"));
		addNewStudent(arr, new Student(3, "Kevin"));
		addNewStudent(arr, new Student(6, "Adam"));
		displayStudentDetails(arr);

		updateStudentName(arr, "Steve", "Rahul");
		displayStudentDetails(arr);

		updateStudentRollNo(arr, 1, 5);
		displayStudentDetails(arr);

		deleteStudent(arr, 3);
		displayStudentDetails(arr);

		deleteStudent(arr, 5);
		displayStudentDetails(arr);

	}

	public static void addNewStudent(HashSet<Student> arr, Student student) {
		arr.add(student);
	}

	public static void updateStudentName(HashSet<Student> arr, String oldName, String newName) {
		for (Student std : arr) {
			if (std.getName().equals(oldName)) {
				std.setName(newName);
				break;
			}
		}
	}

	public static void updateStudentRollNo(HashSet<Student> arr, int oldRollNo, int newRollNo) {
		for (Student std : arr) {
			if (std.getRollNo() == oldRollNo) {
				std.setRollNo(newRollNo);
				break;
			}
		}
	}

	public static void displayStudentDetails(HashSet<Student> arr) {
		for (Student student : arr) {
			System.out.println(student.getRollNo() + " " + student.getName());
		}
		System.out.println();
	}

	public static void deleteStudent(HashSet<Student> arr, int studentRollNo) {
		for (Student std : arr) {
			if (std.getRollNo() == studentRollNo) {
				arr.remove(std);
				break;
			}
		}
	}

}
