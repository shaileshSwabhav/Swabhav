package com.techlab.fileio.test;

import java.io.*;
import java.util.Scanner;

public class FileReadingTest {

	Scanner scan;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileReadingTest readFile = new FileReadingTest();
		File csvFile = new File(
				"src/resource/student.csv");
		readFile.printAllData(csvFile);
		readFile.withoutSpace(csvFile);
		readFile.withoutNull(csvFile);

	}

	void openFile(File csvFile) {
		try {
			scan = new Scanner(csvFile);
		} catch (Exception e) {
			System.out.println(e);
		}
		scan.useDelimiter(",");
	}

	void printAllData(File csvFile) throws Exception {
		System.out.println("Print All Data");

		openFile(csvFile);
		while (scan.hasNext()) {
			System.out.print(scan.next() + " ");
		}
		System.out.println();
	}
//file reading .csv
	
	// Will ignore the blank rows
	void withoutSpace(File csvFile) {
		System.out.println("\nPrint Without Space");

		openFile(csvFile);
		printData(false);
	}

	// Null will be replaced by unspecified
	void withoutNull(File csvFile) {
		System.out.println("\nPrint without NULL");

		openFile(csvFile);
		printData(true);
	}

	void printData(Boolean checkNull) {
		final String NULL_VALUE = "null";
		
		while (scan.hasNext()) {

			String x = scan.nextLine();
			String[] data = x.split(",");

			if (data.length != 1) {
				for (int i = 0; i < data.length; i++) {
					if (checkNull == true && data[i].equals(NULL_VALUE) || data[i].equals("")) {
						System.out.print("unspecified ");
					} else {
						System.out.print(data[i] + " ");
					}
				}
				System.out.println();
			}
		}
	}

}

//ok mam
//no doubt
