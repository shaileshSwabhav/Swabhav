package com.techlab.listcrud;

import java.util.ArrayList;

import com.techlab.student.Student;

public class CrudOnStudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arr = new ArrayList<Student>();

		addNewStudent(arr, new Student(1, "Surya"));
		addNewStudent(arr, new Student(2, "Corey"));
		addNewStudent(arr, new Student(3, "Steve"));
		addNewStudent(arr, new Student(4, "David"));
		displayStudentDetails(arr);

		updateStudentName(arr, "Surya", "Kevin");
		displayStudentDetails(arr);
		
		updateStudentRollNo(arr, 3, 6);
		displayStudentDetails(arr);

		deleteStudent(arr, 2);
		displayStudentDetails(arr);
	}

	public static void addNewStudent(ArrayList<Student> arr, Student student) {
		arr.add(student);
	}

	public static void updateStudentName(ArrayList<Student> arr, String oldName, String newName) {

		for (Student std : arr) {
			if (std.getName().equals(oldName)) {
				std.setName(newName);
				break;
			}
		}
	}

	public static void updateStudentRollNo(ArrayList<Student> arr, int oldRollNo, int newRollNo) {
		for (Student std : arr) {
			if (std.getRollNo() == oldRollNo) {
				std.setRollNo(newRollNo);
				break;
			}
		}
	}

	public static void displayStudentDetails(ArrayList<Student> arr) {
		for (Student student : arr) {
			System.out.println(student.getRollNo() + " " + student.getName());
		}
		System.out.println();
	}

	public static void deleteStudent(ArrayList<Student> arr, int rollNo) {
		for (Student std : arr) {
			if (std.getRollNo() == rollNo) {
				arr.remove(std);
				break;
			}
		}
	}

}
