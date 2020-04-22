package com.techlab.game.test;

import java.util.Scanner;
import com.techlab.game.test.Game;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game gameTest = new Game();
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
		System.out.println("Thanks for playing the game");
	}
}
