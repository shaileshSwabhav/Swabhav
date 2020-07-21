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
	
	public boolean facadePlay(int location) throws Exception {
		
		if (game.getStatus().equals("INPROGRESS")) {
			markInseterd = game.play(location);
		}
		
		if (markInseterd) {
			return true;
		} else {
			return false;
		}
		
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
	
	public void addPlayers(String name, Mark mark) {
		players.add(new Player(name, mark));
	}

	public ArrayList<Player> getPlayer() {
		return players;
	}
	
	public String[] retriveBoard() {
		return board.getBoard();
	}
	
}
