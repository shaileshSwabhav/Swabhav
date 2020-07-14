package com.techlab.game;

public class EmptyTextException extends Exception {

	public EmptyTextException() {
		super("Field cannot be empty.");
	}
}
