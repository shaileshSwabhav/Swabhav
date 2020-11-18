package com.techlab.demo.Assignment;

public class FindMissingNumber {

	final static int NUM_ZERO = 0, NUM_ONE = 1 , NUM_TWO = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] nums = { 1, 4, 5, 3, 2, 8, 6 };

		findNumberXor(nums);
		findNumberWithoutXor(nums);
	}
	// instance variables
	// array

	public static void findNumberXor(int[] num) {

		int smallestNumber = checkNumber(num, true);
		int largestNumber = checkNumber(num, false);
		int xorSum1 = smallestNumber, xorSum2 = num[NUM_ZERO];

		for (int i = smallestNumber + 1; i <= largestNumber; i++) {
			xorSum1 = xorSum1 ^ i;
		}

		for (int i = 1; i < num.length; i++) {
			xorSum2 = xorSum2 ^ num[i];
		}
		// xor of 8 and 15 will be 7

		System.out.println("Missing Number is: " + (xorSum2 ^ xorSum1));

	}
	
	public static void findNumberWithoutXor(int[] num) {

		int smallestNumber = checkNumber(num, true);
		
		int x = NUM_ZERO;
		boolean numberFound = false;
		while (!numberFound) {

			if (x == num.length) {
				System.out.println("Missing Number is: " + smallestNumber);
				numberFound = true;
			} else if (smallestNumber == num[x]) {
				smallestNumber++;
				x = NUM_ZERO;
			} else {
				x++;
			}
		}

	}

	public static int checkNumber(int[] num, boolean smallest) {

		int smallestNumber, largestNumber;

		if (num[NUM_ZERO] > num[NUM_ONE]) {
			smallestNumber = num[NUM_ONE];
			largestNumber = num[NUM_ZERO];
		} else {
			smallestNumber = num[NUM_ZERO];
			largestNumber = num[NUM_ONE];
		}

		for (int i = NUM_TWO; i < num.length; i++) {
			if (smallestNumber > num[i]) {
				smallestNumber = num[i];
			}
			if (largestNumber < num[i]) {
				largestNumber = num[i];
			}
		}

		if (smallest == true) {
			return smallestNumber;
		} else {
			return largestNumber;
		}
	}

}

//first smallest and largest number find kiya
//then usko xor kiya from smallest to largest
//and then array ke elements b xor kiya from 0 to end
//first xor ko second se karne pe missing element mil jayega
//try without xor - modify



