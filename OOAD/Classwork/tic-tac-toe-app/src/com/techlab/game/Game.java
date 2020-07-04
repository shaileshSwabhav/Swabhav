package com.techlab.game;

import java.util.Scanner;

public class Game {

	private Player player1, player2;
	private Board board;
	private ResultAnalyzer analyzeResult;
	private int playCount = 0;

	public Game() {
		board = new Board();
		analyzeResult = new ResultAnalyzer(board);
	}
	
	public Board getBoard() {
		return board;
	}

	public void startGame() throws CellAlreadyOccupiedException, OutOfCellException {

		board.createBoard();
		Player player;
		
		int location, flag = 0;
		Scanner scan = new Scanner(System.in);
		String p;

		while (playCount < 9) {

			// creates new player if player doesn't exists
			if (flag == 0) {

				if (player1 == null) {
					System.out.print("Enter your name: ");
					p = scan.next();
					player1 = new Player(p, Mark.X);
				}
				player = player1;

			} else {
				if (player2 == null) {
					System.out.print("Enter your name: ");
					p = scan.next();
					player2 = new Player(p, Mark.O);
				}

				player = player2;
			}

			System.out.print(player.getName() + " enter cell number: ");
			location = scan.nextInt();

			boolean valueAddedToBoard = addToBoard(player.getMark(), location);

			if (playCount > 4) {
				boolean isWinner = analyzeResult.checkWinner();
				if (isWinner) {
					System.out.println(player.getName() + " is WINNER!!");
					break;
				}
			} else if (playCount > 8) {
				System.out.println("Its a DRAW....");
				break;
			}

			if (valueAddedToBoard && flag == 0) {
				flag++;
			} else if (valueAddedToBoard && flag == 1) {
				flag--;
			}

		}

		scan.close();
	}

	public boolean addToBoard(Mark mark, int location) {

		try {
			if (board.addMarkToCell(mark, location)) {
				playCount++;
				board.printBoard();
				return true;
			}
		} catch (CellAlreadyOccupiedException e) {
			System.out.println(e.getMessage());
		} catch (OutOfCellException e) {
			System.out.println(e.getMessage());
		}
		return false;

	}

}
