package com.techlab.absfactory;

public class EuropeCarFactory {

	public Car buildCar(CarType model) {
		Car car = null;
		switch (model) {
		case MICRO:
			car = new MicroCar(Location.EUROPE);
			break;

		case MINI:
			car = new MiniCar(Location.EUROPE);
			break;

		case LUXURY:
			car = new LuxuryCar(Location.EUROPE);
			break;

		default:
			break;

		}
		return car;
	}

}
