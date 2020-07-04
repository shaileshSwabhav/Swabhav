package com.techlab.game;

public enum Mark {
	X, O;
	
	public String toString() {
		switch(this) {
		case X: return "X";
		case O: return "O";
		}
		return null;
	}
	
}
