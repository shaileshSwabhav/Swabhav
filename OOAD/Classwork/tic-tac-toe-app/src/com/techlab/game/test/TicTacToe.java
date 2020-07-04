package com.techlab.game.test;

import com.techlab.game.CellAlreadyOccupiedException;
import com.techlab.game.Game;
import com.techlab.game.OutOfCellException;

public class TicTacToe {

	public static void main(String[] args) throws OutOfCellException, CellAlreadyOccupiedException {
		// TODO Auto-generated method stub

		Game game = new Game();
		game.startGame();
		
	}

}
