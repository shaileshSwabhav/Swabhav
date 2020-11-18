package com.techlab.game;

public class OutOfCellException extends Exception {

	public OutOfCellException() {
		super("Cell number enterd is out of range.");
	}
}
