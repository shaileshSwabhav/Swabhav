package com.techlab.game;

import java.util.*;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameTest gameTest = new GameTest();
		gameTest.startGame();

	}
	
	void startGame() {

		int max = 9;
		int min = 1;
		int range = max - min + 1;
		boolean guess = false;

		int randomNumber = (int) (Math.random() * range);
		// System.out.println(randomNumber);
		// Get User Input
		Scanner scan = new Scanner(System.in);

		while (!guess) {
			System.out.print("Enter your guess: ");
			int accpetUserNumber = scan.nextInt();

			if (randomNumber != accpetUserNumber) {
				if (accpetUserNumber < randomNumber) {
					System.out.println("Hint: Your guess is low");
				} else {
					System.out.println("Hint: Your guess is high");
				}
			} else {
				System.out.println("Congratualtions!! You have guessed right number");
				guess = true;
			}

		}
		scan.close();
	}
}
