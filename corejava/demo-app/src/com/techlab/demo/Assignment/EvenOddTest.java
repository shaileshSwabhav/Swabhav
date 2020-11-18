package com.techlab.demo.Assignment;

public class EvenOddTest {

	private final int DIVIDEND = 2, REMAINDER = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOddTest evenOdd = new EvenOddTest();

		int[] nums = { 10, 3, 17, 16, 23, 57, 60, 13 };

		evenOdd.checkEvenNumber(nums);
		evenOdd.checkOddNumber(nums);

	}

	public void checkEvenNumber(int[] numbers) {

		System.out.print("Even Numbers are: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % DIVIDEND == REMAINDER) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
	}

	void checkOddNumber(int[] numbers) {

		System.out.print("Odd numbers are: ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % DIVIDEND != REMAINDER) {
				System.out.print(numbers[i] + " ");
			}
		}
	}
}

//public can be used anywhere
