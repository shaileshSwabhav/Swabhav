package com.techlab.absfactory;

public class MicroCar extends Car {

	public MicroCar(Location location) 
    { 
        super(CarType.LUXURY, location); 
        construct(); 
    } 
	
	@Override
	public void construct() {
		// TODO Auto-generated method stub
		System.out.println("Constructing Micro Car");
	}

}
