package com.techlab.movable;

public class Truck implements IMovable {

	@Override
	public void start() {
		System.out.println("Truck has started");
	}
	
	@Override
	public void stop() {
		System.out.println("Truck has stopped");
	}
	
}
