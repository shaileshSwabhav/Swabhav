package com.techlab.demo.Assignment;

import java.util.Scanner;

public class EvenInRangeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenInRangeTest evenNumber = new EvenInRangeTest();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter range: ");
		int range = scan.nextInt();
		
		evenNumber.checkEvenNumber(range);
	}
	
	void checkEvenNumber(int range) {
		
		System.out.print("Even Numbers in the range " +range+ " are: ");
		
		for (int i = 1; i <= range; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
