package com.techlab.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.game.*;

class CellTest {
	
	@Test
	void if_mark_is_empty_when_cell_is_created() {
		
		// Arrange
		String[] expectedBoard1 = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};

		// Act
		Board b = new Board(3);
		b.createBoard();
		String[] board = b.getBoard();

		// Assert
		for(int i = 0; i < expectedBoard1.length; i++) {
			assertEquals(expectedBoard1[i], board[i]);
		}
	}

	
	@Test
	void if_marking_is_done_properly() throws Exception {
		
		// Arrange		
		String[] expectedBoard1 = {"O", "-", "X", "-", "-", "-", "-", "-", "-"};
		
		// Act
		String[] board = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};
		Cell c = new Cell();
		
		c.setMark(Mark.O);
		String[] board1 = c.isCellEmpty(board, 0);
		c.setMark(Mark.X);
		board1 = c.isCellEmpty(board, 2);

		
		// Assert
		for(int i = 0; i < expectedBoard1.length; i++) {
			assertEquals(expectedBoard1[i], board1[i]);

		}
	}
	
	@Test
	void if_set_mark_works_properly() throws Exception {
		
		// Arrange 
		String expectedMark = "X";
		
		// Act
		String[] board = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};

		Cell c = new Cell();
		c.setMark(Mark.X);
		board = c.isCellEmpty(board, 1);
		
		// Assert
		assertEquals(expectedMark, board[1]);
	}
	
	@Test
	void check_if_marks_dont_overwrite_other_marks_in_a_call_and_throws_exception_if_we_try() {
		
		// Arrange
		String expectedException = "Cell is already occupied.";
		
		// Act
		String[] board = {"-", "-", "-", "-", "-", "-", "-", "-", "-"};
		String actualException = null;
		Cell c = new Cell();
		
		try {
			c.setMark(Mark.X);
			c.isCellEmpty(board, 0);
			c.setMark(Mark.O);
			c.isCellEmpty(board, 0);
		} catch (CellAlreadyOccupiedException e) {
			actualException = e.getMessage();
		}
		
		// Assert
		assertTrue(expectedException.contains(actualException));
	}

}
