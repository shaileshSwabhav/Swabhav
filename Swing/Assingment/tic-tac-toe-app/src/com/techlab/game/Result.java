package com.techlab.game;

public enum Result {

	WIN, DRAW, INPROGRESS;
	
	public String toString() {
		switch(this) {
		case WIN: return "WIN";
		case DRAW: return "DRAW";
		case INPROGRESS: return "INPROGRESS";
		}
		return null;
	}
}
