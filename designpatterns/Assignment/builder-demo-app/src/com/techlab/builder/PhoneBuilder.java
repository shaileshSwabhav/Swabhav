package com.techlab.builder;

public class PhoneBuilder {

	String os, processor;
	int ram, battery;
	double screenSize;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, processor, ram, battery, screenSize);
	}
	
}
