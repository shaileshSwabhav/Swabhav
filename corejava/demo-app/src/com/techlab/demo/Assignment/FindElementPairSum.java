package com.techlab.demo.Assignment;

public class FindElementPairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindElementPairSum s = new FindElementPairSum();

		int[] num = { 4, 6, 5, -10, 8, 5, 20 };
		int sum = Integer.parseInt(args[0]);

		s.findPairs(num, sum);

	}

	public void findPairs(int[] num, int sum) {

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

}
