package com.techlab.game.facade;

public class Board {

	private String[] board;
	private Cell cell;
	private int size;

	public Board(int size) {
		this.size = size;
		cell = new Cell();
	}

	public String[] getBoard() {
		return board;
	}

	public Cell getCell() {
		return cell;
	}

	public int getSize() {
		return size;
	}
	
	public void createBoard() {
		board = new String[size * size];
		for (int i = 0; i < board.length; i++) {
			board[i] = "-";
		}
	}

	public boolean isBoardFull() {

		for (int i = 0; i < board.length; i++) {
			if (board[i].equals("-")) {
				return false;
			}
		}
		return true;
	}


	public boolean setCurrentPlayerMark(Mark mark, int location) throws CellAlreadyOccupiedException, OutOfCellException {

		if (!isBoardFull()) {
			cell.setMark(mark);
			board = cell.addMarkToCell(board, location);

			return true;
		}
		return false;
	}
}