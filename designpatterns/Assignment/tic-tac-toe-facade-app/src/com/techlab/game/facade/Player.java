package com.techlab.game.facade;

public class Player {

	String playerName;
	Mark playerMark;
	
	public Player(String playerName, Mark playerMark) {
		this.playerName = playerName;
		this.playerMark = playerMark;
	}

	public String getPlayerName() {
		return playerName;
	}

	public Mark getPlayerMark() {
		return playerMark;
	}	
	
}
