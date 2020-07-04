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
	void testCheckRow() throws CellAlreadyOccupiedException, OutOfCellException {

		// Arrange
		String expectedResult = "WIN";
//		String expectedResult = "INPROGESS";

		// Act
		Board b = new Board();
		ResultAnalyzer r = new ResultAnalyzer(b);

		b.createBoard();
		boolean v1 = b.addMarkToCell(Mark.X, 4);
		boolean v2 = b.addMarkToCell(Mark.X, 5);
		boolean v3 = b.addMarkToCell(Mark.X, 3);
		Result result = r.checkRow();

		// Assert
		assertEquals(expectedResult, result.toString());
	}

	@Test
	void testCheckColumn() throws CellAlreadyOccupiedException, OutOfCellException {

		// Arrange
		String expectedResult = "WIN";

		// Act
		Board b = new Board();
		ResultAnalyzer r = new ResultAnalyzer(b);

		b.createBoard();
		boolean v1 = b.addMarkToCell(Mark.X, 0);
		boolean v2 = b.addMarkToCell(Mark.X, 6);
		boolean v3 = b.addMarkToCell(Mark.X, 3);
		Result result = r.checkColumn();

		// Assert
		assertEquals(expectedResult, result.toString());
	}
	
	@Test
	void testCheckDiagnaol() throws CellAlreadyOccupiedException, OutOfCellException {

		// Arrange
		String expectedResult = "WIN";

		// Act
		Board b = new Board();
		ResultAnalyzer r = new ResultAnalyzer(b);

		b.createBoard();
		boolean v1 = b.addMarkToCell(Mark.X, 2);
		boolean v2 = b.addMarkToCell(Mark.X, 4);
		boolean v3 = b.addMarkToCell(Mark.X, 6);
		Result result = r.checkDiagonal();

		// Assert
		assertEquals(expectedResult, result.toString());
	}


	
	@Test
	void testCheckWinner() throws CellAlreadyOccupiedException, OutOfCellException {
		
		// Arrange
		String expectedV1 = "WIN";
		boolean expectedV2 = false;
		
		// Act
		Board b = new Board();
		b.createBoard();
		boolean v1 = b.addMarkToCell(Mark.X, 3);
		boolean v2 = b.addMarkToCell(Mark.X, 4);
		boolean v3 = b.addMarkToCell(Mark.X, 5);
		
		ResultAnalyzer r = new ResultAnalyzer(b);
		String rValue = r.checkWinner();
		
		// Assert
		assertEquals(expectedV1, rValue);
	}

}
