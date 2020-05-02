package com.techlab.demo.Assignment;

public class SeparateZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeparateZeros s = new SeparateZeros();

		int[] num = { 12, 0, 7, 0, 8, 0, 3 };
//		int[] num = { 1, -5, 0, 0, 8, 0, 1 };

		s.swapZeros(num);

	}

	public void swapZeros(int[] num) {

		int start = 0, end = num.length - 1, temp;

		while (start <= (num.length / 2)) {

			if (num[start] == 0 && num[end] != 0) {
				temp = num[start];
				num[start] = num[end];
				num[end] = temp;
				end--;
			} else if (num[end] == 0) {
				end--;
			} else {
				start++;
			}
		}
		displayArray(num);
		
	}

	public void displayArray(int[] num) {

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
