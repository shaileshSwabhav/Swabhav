package com.techlab.absfactory;

public class AbstractDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFactory car = new CarFactory();
		
        System.out.println(car.buildCar(CarType.MICRO, Location.INDIA)); 
        System.out.println(car.buildCar(CarType.MINI, Location.EUROPE)); 
        System.out.println(car.buildCar(CarType.LUXURY, Location.USA)); 
	
	}

}
