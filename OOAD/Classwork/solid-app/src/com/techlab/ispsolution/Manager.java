package com.techlab.ispsolution;


public class Manager implements IWork, IEat {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager start work");
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager stop work");
	}

	@Override
	public void startEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager start eat");
	}

	@Override
	public void stopEat() {
		// TODO Auto-generated method stub
		System.out.println("Manager stop eat");
	}

}
