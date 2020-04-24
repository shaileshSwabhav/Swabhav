package com.techlab.fileio.test;

import java.util.*;
import java.io.*;

public class LogFileTest {

	static Scanner scan;

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		LogFileTest file = new LogFileTest();
		File dbFile = new File(
				"F:\\\\Swabhav\\\\corejava\\\\demo-app\\\\src\\\\com\\\\techlab\\\\demo\\\\Assignment\\\\file-io-app\\\\src\\\\com\\\\techlab\\\\fileio\\\\test\\\\db_app.log");

		file.openFile(dbFile);
		if (args.length == 0) {
			file.readInput(dbFile, " ");
		} else {
			file.readInput(dbFile, args[0]);
		}

	}

	void openFile(File dbFile) {
		try {
			scan = new Scanner(dbFile);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	void readInput(File dbFile, String flag) {

		while (scan.hasNext()) {

			String x = scan.nextLine();
			String[] data = x.split(" ");

			if ((flag).equals("-i") && data[3].equals("INFO")) {
				printMessage(data);

			} else if ((flag).equals("-e") && data[3].equals("ERROR")) {
				printMessage(data);

			} else if ((flag).equals("-w") && data[3].equals("WARNING")) {
				printMessage(data);

			} else if ((flag).equals(" ")) {
				printMessage(data);

			}
		}
	}

	void printMessage(String[] data) {
		for (String z : data) {
			System.out.print(z + " ");
		}
		System.out.println();
	}

}
