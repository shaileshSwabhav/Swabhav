package com.techlab.builder;

public class Phone {

	String os, processor;
	int ram, battery;
	double screenSize;
	
	public Phone(String os, String processor, int ram, int battery, double screenSize) {
		this.os = os;
		this.processor = processor;
		this.ram = ram;
		this.battery = battery;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", ram=" + ram + ", battery=" + battery
				+ ", screenSize=" + screenSize + "]";
	}
	

}
