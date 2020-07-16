package com.techlab.game.facade;

public class EmptyTextException extends Exception {

	public EmptyTextException() {
		super("Text cannot be empty.");
	}
}
