package com.techlab.demo.Assignment;

public class PositiveNegativeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PositiveNegativeTest num = new PositiveNegativeTest();

		int[] numbers = { -3, 16, 20, 54, -6, -23, 10 };
		
		num.checkPositive(numbers);
		num.checkNegative(numbers);
	}

	
	void checkPositive(int [] numbers) {
		
		System.out.print("Positive numbers are: ");
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		
	}
	
	void checkNegative(int [] numbers) {
		
		System.out.print("Negative numbers are: ");
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		
	}
}
