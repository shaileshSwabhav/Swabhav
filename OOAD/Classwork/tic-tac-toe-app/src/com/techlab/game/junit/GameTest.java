package com.techlab.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.game.Board;
import com.techlab.game.CellAlreadyOccupiedException;
import com.techlab.game.Game;
import com.techlab.game.Mark;
import com.techlab.game.OutOfCellException;
import com.techlab.game.Player;

class GameTest {

	@Test
	void testAddToBoard() throws CellAlreadyOccupiedException, OutOfCellException {

		// Arrange
		boolean expectedValue = true;

		// Act
		Board b = new Board();
		Game g = new Game();

		g.getBoard().createBoard();
		Player p = new Player("sam", Mark.O);

		int location = 3;
		boolean value = g.addToBoard(Mark.X, location);

		// Assert
		assertEquals(expectedValue, value);
	}

	@Test
	void testStartGame() throws CellAlreadyOccupiedException, OutOfCellException {

		// Arrange
		
		// Act
		Game g = new Game();
		g.startGame();
		
		// Assert
		
		
	}

}
