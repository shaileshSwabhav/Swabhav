package com.techlab.lspsolution;

public class Square implements IShapeable {

	private int size;
	
	public Square(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return size * size;
	}

}
