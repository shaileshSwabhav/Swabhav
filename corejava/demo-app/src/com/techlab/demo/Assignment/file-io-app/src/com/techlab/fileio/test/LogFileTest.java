package com.techlab.fileio.test;

import java.util.*;
import java.io.*;

public class LogFileTest {

	static Scanner scan;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		LogFileTest file = new LogFileTest();
		File dbFile = new File(
				"src/resource/db_app.log");

		file.openFile(dbFile);
		if (args.length == 0) {
			file.printMessage(dbFile, "");
		} else {
			file.printMessage(dbFile, args[0]);
		}

	}
	

	void openFile(File dbFile) {
		try {
			scan = new Scanner(dbFile);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void printMessage(File dbFile, String flag) {
		
		final String ERROR = "ERROR";
		final String INFO = "INFO";
		final String WARN = "WARNING";
			
		while (scan.hasNext()) {
			
			String x = scan.nextLine();
			String[] data = x.split("\n");
			
			for(int i = 0; i < data.length; i++) {
				if ((flag).equals("-i") && (data[i].contains(INFO))) {
					System.out.println(data[i]);
				} else if ((flag).equals("-e") && (data[i].contains(ERROR))) {
					System.out.println(data[i]);
				} else if ((flag).equals("-w") && (data[i].contains(WARN))) {
					System.out.println(data[i]);
				} else if ((flag.equals(""))) {
					System.out.println(data[i]);
				}
			}
		}
	}

}
