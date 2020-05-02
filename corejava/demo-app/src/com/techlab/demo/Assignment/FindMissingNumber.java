package com.techlab.demo.Assignment;

public class FindMissingNumber {

	final int NUM_ZERO = 0, NUM_ONE = 1;
	final int NUM_TWO = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindMissingNumber f = new FindMissingNumber();

		int[] nums = { 1, 4, 5, 3, 2, 8, 6 };

		f.findNumber(nums);
	}

	public void findNumber(int[] num) {

		int smallestNumber = checkNumber(num, true);
		int largestNumber = checkNumber(num, false);
		int xorSum1 = smallestNumber, xorSum2 = num[NUM_ZERO];

		for (int i = smallestNumber + 1; i <= largestNumber; i++) {
			xorSum1 = xorSum1 ^ i;
		}

		for (int i = NUM_ONE; i < num.length; i++) {
			xorSum2 = xorSum2 ^ num[i];
		}

		System.out.println("Missing Number is: " + (xorSum2 ^ xorSum1));

	}

	public int checkNumber(int[] num, boolean smallest) {

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
