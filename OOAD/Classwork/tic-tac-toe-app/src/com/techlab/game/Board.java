package com.techlab.game;

public class Board {

	private String[] board;
	private Cell cell;

	public Board() {
		cell = new Cell();
	}

	public String[] getBoard() {
		return board;
	}

	public Cell getCell() {
		return cell;
	}

	public void createBoard() {
		board = new String[9];
		for (int i = 0; i < board.length; i++) {
			board[i] = "-";
		}
	}

	public void printBoard() {
		System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
	}

	public boolean addMarkToCell(Mark mark, int location) throws CellAlreadyOccupiedException, OutOfCellException {

		if (location > 8) {
			throw new OutOfCellException();
		}
		
		if (!cell.isBoardFull(board)) {
			if (cell.isCellEmpty(board, location)) {
				board[location] = mark.toString();
				return true;
			} else {
				throw new CellAlreadyOccupiedException();
			}
		}
		return false;
	}
}
