package com.techlab.game.facade;

import java.util.ArrayList;

public class Game {

	private ArrayList<Player> players = new ArrayList<Player>();
	private Board board;
	private ResultAnalyzer analyzeResult;
	private int currentPlayer = 0, nextPlayer = 1;
	private int flag = 0;

	public Game(ArrayList<Player> players, Board board, ResultAnalyzer analyzeResult) {
		this.players = players;
		this.board = board;
		this.analyzeResult = analyzeResult;
	}

	public Board getBoard() {
		return board;
	}

	public boolean play(int location) throws CellAlreadyOccupiedException, OutOfCellException {

			if (board.setCurrentPlayerMark(getCurrentPlayer().getPlayerMark(), location)) {
				if (flag == 0) {
					currentPlayer++;
					nextPlayer--;
					flag++;
				} else {
					currentPlayer--;
					nextPlayer++;
					flag--;
				}
				return true;
			}
		return false;

	}

	public Player getCurrentPlayer() {
		return players.get(currentPlayer);
	}

	public Player getNextPlayer() {
		return players.get(nextPlayer);
	}

	public String getStatus() {
		return analyzeResult.checkWinner();
	}

}