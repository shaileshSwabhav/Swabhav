package com.techlab.game.test;

import java.util.Scanner;

public class Game {
	
	Scanner scan = new Scanner(System.in);

	public void startGame() {

		int countGuess = 0;
		int max = 9;
		int min = 1;
		int range = max - min + 1;
		boolean guess = false;

		int randomNumber = (int) (Math.random() * range);
		// System.out.println(randomNumber);
		// Get User Input

		while (!guess) {
			// Accept User Input
			System.out.print("Enter your guess: ");
			int accpetUserNumber = scan.nextInt();
			countGuess++;

			if (randomNumber != accpetUserNumber) {
				if (accpetUserNumber < randomNumber) {
					System.out.println("Hint: Your guess is low");
				} else {
					System.out.println("Hint: Your guess is high");
				}
			} else {
				if (randomNumber % 2 == 0) {
					System.out.println("Congratualtions!! You have guessed right number and your number is even");
				} else {
					System.out.println("Congratualtions!! You have guessed right number and your number is odd");
				}

				System.out.println("Your number was : " + randomNumber);
				System.out.println("Number of trails : " + countGuess);
				guess = true;
			}
		}
	}

	public boolean restartGame(boolean gameStarted) {
		boolean userAnswer = false;
		if (!gameStarted) {
			System.out.println("Please Start the game");
		} else {
			System.out.println("Would you like to restart the game?(y|n)");
			String restartChoice = scan.next();

			if (restartChoice.toLowerCase().equals("y")) {
				startGame();
			} else {
				userAnswer = true;
			}
		}
		return userAnswer;
	}
}

//only startGame method

//restart is startGame
// but mam then what will restart have in it
// just a cl to startGame?
//ok mam