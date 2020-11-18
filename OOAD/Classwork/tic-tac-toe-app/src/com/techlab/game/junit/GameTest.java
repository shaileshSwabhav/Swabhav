package com.techlab.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlab.game.Board;
import com.techlab.game.CellAlreadyOccupiedException;
import com.techlab.game.Game;
import com.techlab.game.Mark;
import com.techlab.game.OutOfCellException;
import com.techlab.game.Player;
import com.techlab.game.ResultAnalyzer;

class GameTest {


	@Test
	void test_ifPlayerIsSwapped() {
		
		// Arrange
		String expectedPlayer1 = "sam";
		Mark expectedPlayer1Mark = Mark.X;
		
		String expectedPlayer2 = "tom";
		Mark expectedPlayer2Mark = Mark.O;
		
		// Act
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("sam", Mark.X));
		players.add(new Player("tom", Mark.O));
		
		Board b = new Board(3);
		ResultAnalyzer a = new ResultAnalyzer(b);
		
		Game game = new Game(players, b, a);
		
		String actualPlayer1 = game.getCurrentPlayer().getName();
		String actualPlayer2 = game.getNextPlayer().getName();
		Mark actualPlayer1Mark = game.getCurrentPlayer().getMark();
		Mark actualPlayer2Mark = game.getNextPlayer().getMark();
		
		// Assert
		assertEquals(expectedPlayer1, actualPlayer1);
		assertEquals(expectedPlayer2, actualPlayer2);
		assertEquals(expectedPlayer1Mark, actualPlayer1Mark);
		assertEquals(expectedPlayer2Mark, actualPlayer2Mark);		
		
	}
	
	@Test
	void test_if_correct_status_is_returned() throws Exception {
		
		// Arrange
		String expectedStatus1 = "WIN";
		
		// Act
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("sam", Mark.X));
		players.add(new Player("tom", Mark.O));
		
		Board b = new Board(3);
		b.createBoard();
		ResultAnalyzer a = new ResultAnalyzer(b);
		
		Game game = new Game(players, b, a);
		
		boolean m1 = game.play(0);
		System.out.println();
		
		boolean m2 = game.play(4);
		System.out.println();
		
		boolean m3 = game.play(2);
		System.out.println();
		
		boolean m4 = game.play(3);
		System.out.println();

		boolean m5 = game.play(1);
		System.out.println();

		
		String actualStatus1 = game.getStatus();
		
		// Assert
		assertEquals(expectedStatus1, actualStatus1);		
	}
}
