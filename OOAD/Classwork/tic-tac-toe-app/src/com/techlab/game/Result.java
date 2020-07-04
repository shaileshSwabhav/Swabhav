package com.techlab.game;

public enum Result {
	WIN, DRAW, INPROGESS;
	
	public String toString() {
		switch(this) {
		case WIN: return "WIN";
		case DRAW: return "DRAW";
		case INPROGESS: return "INPROGESS";
		}
		return null;
	}
}
