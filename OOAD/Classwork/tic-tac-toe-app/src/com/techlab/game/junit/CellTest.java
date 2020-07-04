package com.techlab.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.game.Board;
import com.techlab.game.Cell;
import com.techlab.game.CellAlreadyOccupiedException;
import com.techlab.game.Mark;
import com.techlab.game.OutOfCellException;

class CellTest {

	@Test
	void testIsBoardFull() {
		
		// Arrange
		boolean expectedValue = false;
		
		// Act
		Cell c = new Cell();
		Board b = new Board();
		b.createBoard();
		boolean value = c.isBoardFull(b.getBoard());
		
		// Assert
		assertEquals(expectedValue, value);
	}
	
	@Test
	void testIsCellEmpty() throws Exception {
		
		// Arrange
		boolean expectedValue = true;
		boolean expectedValue1 = false;
		
		// Act
		Cell c = new Cell();
		Board b = new Board();
		b.createBoard();
		boolean value = c.isCellEmpty(b.getBoard(), 0);
		b.addMarkToCell(Mark.X, 2);
		boolean value1 = c.isCellEmpty(b.getBoard(), 2);
		
		// Assert
		assertEquals(expectedValue, value);
		assertEquals(expectedValue1, value1);
	}

}
