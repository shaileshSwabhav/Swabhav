package com.techlab.exception;

import java.util.Scanner;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 16;
	
		try {
			canVoteUserInput();
		} catch (UncheckedException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			canVote(16);
		} catch (CheckedException e) {
			System.out.println(e.getMessage());
		}	

	}
	
	public static void canVote(int age) throws CheckedException {
		if (age < 18) {
			throw new CheckedException();
		} else {
			System.out.println("You can vote");
		}
	}
	
	public static void canVoteUserInput() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = scan.nextInt();
		
		if (age < 18) {
			throw new UncheckedException();
		} else {
			System.out.println("You can vote");
		}
		scan.close();
		
	}

}
