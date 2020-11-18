package com.techlab.lspsolution;

public class Rectangle implements IShapeable {

	private int height, width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int calculateArea() {
		return height * width;
	}

}
