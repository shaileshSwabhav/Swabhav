package com.techlab.mapcrud;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.techlab.student.Student;

public class CrudOnStudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> arr = new HashMap<Integer, String>();

		addNewStudent(arr, new Student(1, "Matthew"));
		addNewStudent(arr, new Student(2, "Smrithi"));
		addNewStudent(arr, new Student(3, "Leo"));
		addNewStudent(arr, new Student(4, "Kane"));
		displayStudentDetails(arr);

		deleteStudent(arr, 2);
		displayStudentDetails(arr);

		updateStudentRollNo(arr, 3, 6);
		displayStudentDetails(arr);

		updateStudentName(arr, "Leo", "Sunil");
		displayStudentDetails(arr);

	}

	public static void addNewStudent(HashMap<Integer, String> arr, Student student) {
		arr.put(student.getRollNo(), student.getName());
	}

	public static void updateStudentName(HashMap<Integer, String> arr, String oldName, String newName) {
		for (Map.Entry<Integer, String> std : arr.entrySet()) {
			if (std.getValue().equals(oldName)) {
				int key = std.getKey();
				arr.remove(std.getKey());
				arr.put(key, newName);
				break;
			}
		}
	}

	public static void updateStudentRollNo(HashMap<Integer, String> arr, int oldRollNo, int newRollNo) {
		for (Map.Entry<Integer, String> std : arr.entrySet()) {
			if (std.getKey() == oldRollNo) {
				arr.put(newRollNo, std.getValue());
				arr.remove(std.getKey());
				break;
			}
		}

	}

	public static void displayStudentDetails(HashMap<Integer, String> arr) {
		for (Map.Entry<Integer, String> e : arr.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		System.out.println();
	}

	public static void deleteStudent(HashMap<Integer, String> arr, int rollNo) {
		for (Map.Entry<Integer, String> std : arr.entrySet()) {
			if (std.getKey() == rollNo) {
				arr.remove(std.getKey());
				break;
			}
		}
	}
}
