package com.techlab.absfactory;

public abstract class Car {

	CarType model;
	Location location;

	public Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}

	abstract void construct();

	CarType getModel() {
		return model;
	}

	Location getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", location=" + location + "]";
	}

}
