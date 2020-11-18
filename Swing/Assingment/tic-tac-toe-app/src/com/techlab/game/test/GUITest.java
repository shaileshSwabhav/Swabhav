package com.techlab.game.test;

import com.techlab.game.*;

public class GUITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Board board = new Board();
		Game game = new Game(board, new ResultAnalyzer(board));
	}

}
