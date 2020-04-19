package com.techlab.demo;

public class MagicNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MagicNumberTest magicNum = new MagicNumberTest();
		int num = 1234;
		
		int result = magicNum.magicNumber(num);
		
		if (result == 1) {
			System.out.println(num + " is a Magic Number.");
		} else {
			System.out.println(num + " is not a Magic Number.");
		}

	}
	
	public int magicNumber(int num) {
		int result = 0;

		while (num > 9) {
			int temp = num;
			int digit, sum = 0;

			while(temp != 0) {	
				digit = temp % 10;
				sum = sum + digit;
				temp = temp / 10;
			}
		num = sum;
		result = sum;
		}
		
		return result;
		
	}
}
