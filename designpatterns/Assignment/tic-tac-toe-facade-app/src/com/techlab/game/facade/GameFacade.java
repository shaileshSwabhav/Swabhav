package com.techlab.game.facade;

import java.util.ArrayList;
import java.util.Scanner;

public class GameFacade {

	static Scanner scan = new Scanner(System.in);
	boolean markInseterd = false;

	private Board board;
	private Game game;
	private ResultAnalyzer resultAnalyzer;

	private ArrayList<Player> players = new ArrayList<Player>();

	public GameFacade(int boardSize) {

		board = new Board(boardSize);
		resultAnalyzer = new ResultAnalyzer(board);

		board.createBoard();

		game = new Game(players, board, resultAnalyzer);

	}

	public void facadePlay(int location) throws Exception {

		game.play(location);

	}

	public boolean checkWinner() {

		if (game.getStatus().equals("WIN")) {
			return true;
		}
		return false;
	}

	public boolean checkDraw() {

		if (game.getStatus().equals("DRAW")) {
			return true;
		}
		return false;
	}
	
	public String getCurrentPlayerName() {
		return game.getCurrentPlayer().getPlayerName();
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void addPlayers(String name, Mark mark) {
		players.add(new Player(name, mark));
	}

	public String[] retriveBoard() {
		return board.getBoard();
	}

}
