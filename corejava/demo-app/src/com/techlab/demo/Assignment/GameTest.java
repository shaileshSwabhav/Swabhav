package com.techlab.demo.Assignment;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameTest gameTest = new GameTest();

		// gameTest.startGame();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		boolean endGame = false;
		boolean gameStarted = false;

		while (!endGame) {

			System.out.println("Enter your choice");
			System.out.println("1. Start Game.\n2. Restart Game.\n3. Exit ");
			// choice = scan.nextInt();

			choice = scan.nextInt();

			switch (choice) {

			case 1:
				gameTest.startGame();
				gameStarted = true;
				break;

			case 2:
				//Game cannot be restarted before it is played once.
				if (!gameStarted) {
					System.out.println("Please first start the game");
					break;
				} else {
					System.out.println("Would you like to play the game again?(y|n)");
					String restartChoice = scan.next();

					if (restartChoice.toLowerCase().equals("y")) {
						gameTest.startGame();
						break;
					} else {
						endGame = true;
						break;
					}
				}
			case 3:
				endGame = true;
				break;

			default:
				System.out.println("Enter valid choice");
			}
		}
	}

	void startGame() {

		int max = 9;
		int min = 1;
		int range = max - min + 1;
		boolean guess = false;

		int randomNumber = (int) (Math.random() * range);
		// System.out.println(randomNumber);
		// Get User Input
		Scanner scannerGame = new Scanner(System.in);

		while (!guess) {
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
		// scannerGame.close();
	}

}
