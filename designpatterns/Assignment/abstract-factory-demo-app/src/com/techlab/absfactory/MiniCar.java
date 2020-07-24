package com.techlab.absfactory;

public class MiniCar extends Car {

	public MiniCar(Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("Constructing Mini Car");
	}

}
