package com.techlab.demo.Assignment;

public class FindElementPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 4, 6, 5, -10, 8, 5, 20 };
		int sum = Integer.parseInt(args[0]);

		findPairs(num, sum);
		findPairNoNested(num, sum);
	}

	public static void findPairs(int[] num, int sum) {
		
		
		System.out.println("Time complexity: O(n2)");
		for (int i = 0; i < (num.length - 1); i++) {
			for (int j = (i + 1); j < num.length; j++) {

				if ((num[i] + num[j]) == sum) {
					System.out.println(num[i] + " + " + num[j] + " = " + sum);
				} else {
					j++;
				}
			}
		}
	}

	public static void findPairNoNested(int [] num, int sum) {
		System.out.println("Time complexity: O(n)");

		int i = 0, j = i+1;
		
		while (i < (num.length - 1)) {
			
			if (j == (num.length)) {
				i++;
				j = i + 1;
			} else if ((num[i] + num[j]) == sum) {
				System.out.println(num[i] + " + " + num[j] + " = " + sum);
				j++;
			} else {
				j++;
			}
		}
		
	}	
}

//used to for loops and the first one will stay at ith index
//and j will jo through the entire array and every elememt to ith element
//eg i = 0 then num[0] = 4
//so i will add 4 to every element of array from i+1
//o(n2)
//reduce time complextiy - modify
