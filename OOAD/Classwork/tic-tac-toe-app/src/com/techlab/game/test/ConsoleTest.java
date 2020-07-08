package com.techlab.game.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.game.*;

public class ConsoleTest {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Player player1 = null, player2 = null;
		ArrayList<Player> players = new ArrayList<Player>();

		String p;
		int location;
		System.out.print("Enter board size: ");
		int size = scan.nextInt();
		Board board = new Board(size);
		board.createBoard();

		Game game = new Game(players, board, new ResultAnalyzer(board));

		String name = getFirstDataFromUser(game, players);
		while (true) {
			System.out.print(name + " enter cell number: ");
			location = scan.nextInt();
			if (game.play(location)) {
				break;
			}
		}

		name = getFirstDataFromUser(game, players);
		while (true) {
			System.out.print(name + " enter cell number: ");
			location = scan.nextInt();
			if (game.play(location)) {
				break;
			}
		}

		while (game.getStatus().equals("INPROGESS")) {

			System.out.print(game.getCurrentPlayer().getName() + " enter cell number: ");
			location = scan.nextInt();

			game.play(location);

		}

		if (game.getStatus().equals("WIN")) {
			System.out.println(game.getNextPlayer().getName() + " is WINNER!!");
		} else if (game.getStatus().equals("DRAW")) {
			System.out.println("It's a DRAW...");
		}

		scan.close();
	}

	public static String getFirstDataFromUser(Game game, ArrayList<Player> players) throws Exception {

		Player player;
		String p;

		System.out.print("Enter your name: ");
		p = scan.next();
		if (players.isEmpty()) {
			player = new Player(p, Mark.X);
		} else {
			player = new Player(p, Mark.O);
		}
		players.add(player);
		return p;

	}

}
