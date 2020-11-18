package com.techlab.absfactory;

public class LuxuryCar extends Car {

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		// TODO Auto-generated method stub
		System.out.println("Constructing Luxury Car");
	}

}
