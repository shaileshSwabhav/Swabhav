package com.techlab.game.test;

import java.util.Scanner;

public class Game {

	public void startGame() {

		int max = 9;
		int min = 1;
		int range = max - min + 1;
		boolean guess = false;

		int randomNumber = (int) (Math.random() * range);
		// System.out.println(randomNumber);
		// Get User Input
		Scanner scannerGame = new Scanner(System.in);

		while (!guess) {
			// Accept User Input
			System.out.print("Enter your guess: ");
			int accpetUserNumber = scannerGame.nextInt();

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
	}
}
