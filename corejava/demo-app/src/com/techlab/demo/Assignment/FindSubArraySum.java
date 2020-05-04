package com.techlab.demo.Assignment;

public class FindSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindSubArraySum s = new FindSubArraySum();

		int[] num = { 42, 15, 12, 8, 6, 32 };
//		int[] num = { 12, 5, 31, 13, 21, 8 };
		int sum = Integer.parseInt(args[0]);

		s.findSubArray(num, sum);

	}

	public void findSubArray(int[] num, int sum) {

		int total = 0;
		int i = 0, start = i;

		while (i <= num.length) {

			if (total == sum) { // here i am checking if i am getting my total as sum

				System.out.print("Continous sub array is: ");
				while (start != i) {
					System.out.print(num[start] + " ");
					start++;
				}
				System.out.println();
				total = 0;
				i--;

			} else if (total > sum) { //if not the 
				total = 0;
				i = start;
				
			} else if (total < sum && i < num.length) {	//if total is less the sum means i can add next element of array to the total
				// for last iteration the length exceeds the range of array.
				if (total == 0) {
					start = i;
				}
				total = total + num[i];
			}
			i++;

		}

	}

}
//first start variable liya which points from where addition starts
//and i will loop thru the array
//total will store the sum to check if i get the required total
//o(n)