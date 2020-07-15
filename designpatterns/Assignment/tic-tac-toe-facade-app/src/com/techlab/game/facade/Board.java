package com.techlab.game.facade;

import javax.swing.*;

public class Board extends JFrame {

	private JButton[] board;
	private Cell cell;
	private int boardSize;

	public Board() {
		super("Tic-Tac-Toe");
		cell = new Cell();
	}
	
	public void setBoardSize(int boardSize) {
		this.boardSize = boardSize;
	}

	public int getBoardSize() {
		return this.boardSize;
	}

	public JButton[] getBoard() {
		return board;
	}

	public Cell getCell() {
		return cell;
	}

	public void gameBoard() {

		board = new JButton[boardSize * boardSize];

		for (int i = 0; i < (boardSize * boardSize); i++) {
			board[i] = new JButton();
			board[i].setText("-");
		}
	}

	public boolean isBoardFull() {

		for (int i = 0; i < board.length; i++) {
			if (!board[i].getText().equals("")) {
				return false;
			}
		}

		return true;
	}

	public void addMarkToCell(Mark mark, JButton button) {
		
		cell.setMark(mark);
		try {
			cell.addMark(button);
		} catch (CellAlreadyOccupiedException e1) {
			JOptionPane.showMessageDialog(null, new CellAlreadyOccupiedException());
		}
		
	}


}
