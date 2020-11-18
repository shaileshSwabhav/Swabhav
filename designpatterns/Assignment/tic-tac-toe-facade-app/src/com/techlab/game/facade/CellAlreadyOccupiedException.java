package com.techlab.game.facade;

public class CellAlreadyOccupiedException extends Exception {

	public CellAlreadyOccupiedException() {
		super("Cell is already occupied.");
	}
}
