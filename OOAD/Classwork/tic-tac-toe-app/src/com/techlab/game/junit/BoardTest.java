package com.techlab.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.game.Board;
import com.techlab.game.CellAlreadyOccupiedException;
import com.techlab.game.Mark;
import com.techlab.game.OutOfCellException;

class BoardTest {

	@Test
	void check_if_board_is_created_with_proper_number_of_Cells() {

		// Arrange
		int expectedSize = 9;

		// Act
		Board b = new Board(3);
		b.createBoard();
		int actualSize = b.getBoard().length;

		// Assert
		assertEquals(expectedSize, actualSize);
	}

	@Test
	void check_if_board_has_empty_cells() {

		// Arrange
		String[] expectedBoard = { "-", "-", "-", "-", "-", "-", "-", "-", "-" };

		// Act
		Board b = new Board(3);
		b.createBoard();
		String[] actualBoard = b.getBoard();

		// Assert
		for (int i = 0; i < expectedBoard.length; i++) {
			assertEquals(expectedBoard[i], actualBoard[i]);
		}

	}

	@Test
	void check_if_marks_can_be_set_on_a_given_position() throws CellAlreadyOccupiedException, OutOfCellException {

		// Arrange
		boolean expectedValue1 = true;
		boolean expectedValue2 = true;

		// Act
		Board b = new Board(3);
		Mark mark = Mark.X;
		Mark mark1 = Mark.O;
		b.createBoard();
		boolean v1 = b.addMarkToCell(mark, 2);
		boolean v2 = b.addMarkToCell(mark1, 1);

		// Assert
		assertEquals(expectedValue1, v1);
		assertEquals(expectedValue2, v2);
	}

	@Test
	void check_if_marks_dont_overwrite_other_marks_and_throws_exception_if_we_try() {

		// Arrange
		String expectedException = "Cell is already occupied.";

		// Act
		String actualException = null;
		Board b = new Board(3);
		b.createBoard();
		Mark mark1 = Mark.X;
		Mark mark2 = Mark.O;
		try {
			boolean actualValue1 = b.addMarkToCell(mark1, 0);
			boolean actualValue2 = b.addMarkToCell(mark2, 0);

		} catch (CellAlreadyOccupiedException | OutOfCellException e) {
			actualException = e.getMessage();
		}

		// Assert
		assertTrue(expectedException.contains(actualException));

	}

	@Test
	void check_if_board_full_returns_true_if_board_is_full() throws Exception {

		// Arrange 
		boolean expectedValue = true;

		// Act 
		Board b = new Board(3); 
		b.createBoard(); 
		Mark mark1 = Mark.X; 
		Mark mark2 = Mark.O;

		boolean a1 = b.addMarkToCell(mark1, 0);
		boolean a2 = b.addMarkToCell(mark2, 1);
		boolean a3 = b.addMarkToCell(mark1, 2);
		boolean a4 = b.addMarkToCell(mark2, 3);
		boolean a5 = b.addMarkToCell(mark1, 4);
		boolean a6 = b.addMarkToCell(mark2, 5);
		boolean a7 = b.addMarkToCell(mark1, 6);
		boolean a8 = b.addMarkToCell(mark2, 7);
		boolean a9 = b.addMarkToCell(mark1, 8);

		boolean actualValue = b.isBoardFull();

		// Assert 
		assertEquals(expectedValue, actualValue);

	}

	@Test
	void check_board_print() {

		Board b = new Board(2);
		b.createBoard();
		b.printBoard();
	}

}
