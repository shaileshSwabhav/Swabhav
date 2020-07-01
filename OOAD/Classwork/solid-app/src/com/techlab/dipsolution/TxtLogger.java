package com.techlab.dipsolution;

public class TxtLogger implements ILogable {

	@Override
	public void log(String error) {
		System.out.println("Writing to the file");
		System.out.println(error);
	}

}
