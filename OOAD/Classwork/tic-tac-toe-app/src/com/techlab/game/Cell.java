package com.techlab.game;

public class Cell {

	public boolean isBoardFull(String[] board) {

		for (int i = 0; i < board.length; i++) {
			if (board[i].equals("-")) {
				return false;
			}
		}
		return true;
	}

	public boolean isCellEmpty(String[] board, int location) throws CellAlreadyOccupiedException {

		if (!board[location].equals("-")) {
			return false;
		} else {
			return true;
		}
	}

}
