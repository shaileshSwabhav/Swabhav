package com.techlab.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.game.Board;
import com.techlab.game.CellAlreadyOccupiedException;
import com.techlab.game.Mark;
import com.techlab.game.OutOfCellException;

class BoardTest {

	@Test
	void testCreateBoard() {
		
		// Arrange
		String[] expectedBoard = new String[9];
		
		// Act
		Board b = new Board();
		b.createBoard();
		
		// Assert
		assertEquals(expectedBoard.length, b.getBoard().length);
	}

	@Test
	void testAddMarkToCell() throws CellAlreadyOccupiedException, OutOfCellException {
		
		// Arrange
		boolean expectedValue1 = true;
		boolean expectedValue2 = true;
		
		// Act
		Board b = new Board();
		Mark mark = Mark.X;
		Mark mark1 = Mark.O;
		b.createBoard();
		boolean v1 = b.addMarkToCell(mark, 2);
		boolean v2 = b.addMarkToCell(mark1, 1);
		
		// Assert
		assertEquals(expectedValue1, v1);
		assertEquals(expectedValue2, v2);
	}
}
