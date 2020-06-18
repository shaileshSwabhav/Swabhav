package com.techlab.game.test;

import java.util.Scanner;
import com.techlab.game.test.Game;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game games = new Game();
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		boolean endGame = false;
		boolean gameStarted = false;
		final int START_GAME = 1;
		final int RESTART_GAME = 2;
		final int END_GAME = 3;


		System.out.println("Enter your choice");
		System.out.println("1. Start Game.\n2. Restart Game.\n3. Exit ");
		choice = scan.nextInt();

		do {

			switch (choice) {

			case START_GAME:
				games.startGame();
				gameStarted = true;
				break;

			case RESTART_GAME:
				// Game cannot be restarted before it is played once.
//				if (!gameStarted) {
//					System.out.println("Please first start the game");
//					break;
//				} else {
//					System.out.println("Would you like to play the game again?(y|n)");
//					String restartChoice = scan.next();
//
//					if (restartChoice.toLowerCase().equals("y")) {
//						games.startGame();
//						break;
//					} else {
//						endGame = true;
//						break;
//					}
//				}
				
				endGame = games.restartGame(gameStarted);
				break;

			
			case END_GAME:
				endGame = true;
				break;

			default:
				System.out.println("Enter valid choice");
			}

			if (!endGame) {
				System.out.println("Enter your choice");
				System.out.println("1. Start Game.\n2. Restart Game.\n3. Exit ");
				choice = scan.nextInt();
			}

		} while (!endGame);
		System.out.println("Thanks for playing the game");
		scan.close();
	}
}

//use do while loop instead of while (done)
//we do not to use numbers in cases.
// case start instead of case 1
// final keyword (done)
// if you have guessed right number then check if the number is even or odd and print it on console
// congrats you have won the game and ur number was even/odd. (done)

