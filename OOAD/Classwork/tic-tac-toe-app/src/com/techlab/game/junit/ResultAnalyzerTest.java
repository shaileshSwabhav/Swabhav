package com.techlab.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.game.Board;
import com.techlab.game.CellAlreadyOccupiedException;
import com.techlab.game.Mark;
import com.techlab.game.OutOfCellException;
import com.techlab.game.Result;
import com.techlab.game.ResultAnalyzer;

class ResultAnalyzerTest {

	@Test
	void check_row_for_winner() throws Exception {

		// Arrange
		String expectedResult = "WIN";
//		String expectedResult = "INPROGESS";

		// Act
		Board b = new Board(4);
		ResultAnalyzer r = new ResultAnalyzer(b);

		b.createBoard();
		
		boolean v1 = b.addMarkToCell(Mark.X, 0);
		boolean v2 = b.addMarkToCell(Mark.X, 1);
		boolean v3 = b.addMarkToCell(Mark.X, 2);
		boolean v4 = b.addMarkToCell(Mark.X, 3);
		
		Result result = r.checkRow();
		b.printBoard();
		System.out.println("Row: " + result.toString());
		
		// Assert
		assertEquals(expectedResult, result.toString());
	}

	@Test
	void check_column_for_winner() throws Exception {

		// Arrange
		String expectedResult = "WIN";

		// Act
		Board b = new Board(4);
		ResultAnalyzer r = new ResultAnalyzer(b);

		b.createBoard();
		boolean v1 = b.addMarkToCell(Mark.O, 1);
		boolean v2 = b.addMarkToCell(Mark.O, 9);
		boolean v3 = b.addMarkToCell(Mark.O, 5);
		boolean v4 = b.addMarkToCell(Mark.O, 13);

		Result result = r.checkColumn();
		b.printBoard();
		System.out.println("Column: " + result.toString());

		// Assert
		assertEquals(expectedResult, result.toString());
	}
	
	@Test
	void check_diagonal_for_winner() throws Exception {

		// Arrange
		String expectedResult = "WIN";

		// Act
		Board b = new Board(3);
		ResultAnalyzer r = new ResultAnalyzer(b);

		b.createBoard();
		boolean v1 = b.addMarkToCell(Mark.X, 2);
		boolean v2 = b.addMarkToCell(Mark.X, 4);
		boolean v3 = b.addMarkToCell(Mark.X, 6);
//		boolean v4 = b.addMarkToCell(Mark.X, 15);
		Result result = r.checkDiagonal();

		b.printBoard();
		System.out.println("Diagonal: " + result.toString());

		// Assert
		assertEquals(expectedResult, result.toString());
	}
	
	@Test
	void check_for_draw() throws Exception {
		
		// Arrange
		String expectedValue = "DRAW";
		
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
		boolean a7 = b.addMarkToCell(mark2, 6);
		boolean a8 = b.addMarkToCell(mark1, 7);
		boolean a9 = b.addMarkToCell(mark2, 8);
		
		ResultAnalyzer r = new ResultAnalyzer(b);
		String actualValue = r.checkWinner();
		
		// Assert
		assertEquals(expectedValue, actualValue);

	}

}
