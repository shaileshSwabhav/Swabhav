package com.techlab.game.facade;

public class GameFacade {

	private Board board;
	private Game game;
	private ResultAnalyzer resultAnalyzer;
	
	public GameFacade() {
		board = new Board();
		resultAnalyzer = new ResultAnalyzer(board);
		game = new Game(board, resultAnalyzer);
	}
	
}
