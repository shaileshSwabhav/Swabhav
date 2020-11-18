package com.techlab.absfactory;

public class CarFactory {

	public Car buildCar(CarType model, Location location) {

		Car car = null;

		switch (location) {
		case USA:
			car = new USACarFactory().buildCar(model);
			break;

		case INDIA:
			car = new INDIACarFactory().buildCar(model);
			break;

		case EUROPE:
			car = new EuropeCarFactory().buildCar(model);
			break;

		default:
			break;
		}

		return car;
	}

}
