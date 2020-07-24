package com.techlab.composite;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		IComponent hdd = new Leaf("Hard Drive", 3000);
		IComponent mouse = new Leaf("Mouse", 500);
		IComponent monitor = new Leaf("Monitor", 7000);
		IComponent ram = new Leaf("Ram", 5000);
		IComponent cpu = new Leaf("CPU", 5000);
		
		IAddComponent motherboard = new Composite("MotherBoard");
		IAddComponent peripheral = new Composite("Peripheral");
		IAddComponent cabinet = new Composite("Cabinet");
		IAddComponent computer = new Composite("Computer");
		
		peripheral.addComponent(mouse);
		peripheral.addComponent(monitor);
		motherboard.addComponent(ram);
		motherboard.addComponent(cpu);
		cabinet.addComponent(motherboard);
		cabinet.addComponent(hdd);
		computer.addComponent(peripheral);
		computer.addComponent(cabinet);
						
		computer.showPrice();
		
	}

}
