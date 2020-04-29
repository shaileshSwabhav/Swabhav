package com.techlab.demo.Assignment;

public class EvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOddTest evenOdd = new EvenOddTest();

		int[] nums = { 10, 3, 17, 16, 23, 57, 60, 13 };

		evenOdd.checkEven(nums);
		evenOdd.checkOdd(nums);

	}

	void checkEven(int[] numbers) {

		System.out.print("Even Numbers are: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
	}

	void checkOdd(int[] numbers) {

		System.out.print("Odd numbers are: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				System.out.print(numbers[i] + " ");
			}
		}
	}
}
