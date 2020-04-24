package com.techlab.commandLine;

import java.util.*;

public class CommandLineTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CommandLineTest1 commandLine = new CommandLineTest1();

		// sorting for even and odd

		if (args[args.length - 1].equals("-e")) {
			commandLine.printEvenNumbers(args);
		} else if (args[args.length - 1].equals("-o")) {
			commandLine.printOddNumbers(args);
		} else {
			commandLine.printNumber(args);
		}
		
		commandLine.calculateAverage(args);
		commandLine.calculatePercentage(args);
	}

	void printEvenNumbers(String[] arr) {
		System.out.print("Numbers are: ");

		for (int i = 0; i < arr.length - 1; i++) {
			if (Integer.parseInt(arr[i]) % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	void printOddNumbers(String[] arr) {
		System.out.print("Numbers are: ");

		for (int i = 0; i < arr.length - 1; i++) {
			if (Integer.parseInt(arr[i]) % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

	void printNumber(String[] arr) {
		System.out.print("Numbers are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	void calculateAverage(String[] arr) {
		int sum = 0;
		int result = 0;

		for (int i = 0; i < arr.length; i++) {

			sum = sum + Integer.parseInt(arr[i]);
		}
		result = sum / (arr.length);
		System.out.println();
		System.out.println("Average is: " + result);
	}

	void calculatePercentage(String[] arr) {

		int evenNumberCount = 0;
		double percentage = 0.0;
		
//		if (arr[arr.length - 1].equals("-e") || arr[arr.length - 1].equals("-o")) {
//			
//		}
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (Integer.parseInt(arr[i]) % 2 == 0) {
				evenNumberCount++;
			}
		}
		percentage = (double) (evenNumberCount * 100) / arr.length;
		System.out.println("Percentage is: " + percentage + "%");

	}

}
