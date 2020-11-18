package com.techlab.game.facade;

public class OutOfCellException extends Exception {

	public OutOfCellException() {
		super("Cell is out of bound.");
	}
}
