package com.techlab.lspviolation;

public class Square extends Rectangle {

	private int side;

	public Square(int side) {
		super(side, side);
	}

	@Override
	public void setHeight(int side) {
		this.height = side;
		this.width = side;
	}

	@Override
	public void setWidth(int side) {
		this.height = side;
		this.width = side;
	}
}
