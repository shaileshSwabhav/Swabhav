package com.techlab.game.facade.test;

import java.util.*;

import com.techlab.game.facade.GameFacade;
import com.techlab.game.facade.Mark;

public class GameTest {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int location, index = 1;
		String name;
		boolean markInserted = true;

		System.out.print("Enter board size: ");
		int boardSize = scan.nextInt();

		GameFacade facade = new GameFacade(boardSize);

		name = getFirstDataFromUser(facade);
		getLocation(facade, name);
		printBoard(facade, boardSize);

		name = getFirstDataFromUser(facade);
		getLocation(facade, name);
		printBoard(facade, boardSize);

		while (!facade.checkWinner()) {

			index = (int) (markInserted ? (index == 1) ? (index -= 1) : (index += 1) : index);

			System.out.print(facade.getPlayer().get(index).getPlayerName() + " enter cell number: ");
			location = scan.nextInt();

			try {
				markInserted = facade.facadePlay(location);
				printBoard(facade, boardSize);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				markInserted = false;
			}

		}


		if (facade.checkWinner()) {
			System.out.println(facade.getPlayer().get(index).getPlayerName() + " is WINNER!!!");
		} else if (facade.checkDraw()) {
			System.out.println("It's a DRAW.......");
		}

	}

	public static String getFirstDataFromUser(GameFacade facade) throws Exception {

		String p;

		System.out.print("Enter your name: ");
		p = scan.next();
		if (facade.getPlayer().isEmpty()) {
			facade.addPlayers(p, Mark.X);
		} else {
			facade.addPlayers(p, Mark.O);
		}
		return p;

	}

	public static void getLocation(GameFacade facade, String name) {

		int location;

		while (true) {
			System.out.print(name + " enter cell number: ");
			location = scan.nextInt();
			try {
				if (facade.facadePlay(location)) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public static void printBoard(GameFacade facade, int boardSize) {

		String[] board = facade.retriveBoard();
		int length = board.length;

		int j = 1;
		for (int i = 0; i < length; i++) {
			if (j <= boardSize) {
				System.out.print("| " + board[i] + " ");
				j++;

			} else {
				j = 2;
				System.out.println("|");
				System.out.print("| " + board[i] + " ");
			}
		}
		System.out.println("|");

	}

}
