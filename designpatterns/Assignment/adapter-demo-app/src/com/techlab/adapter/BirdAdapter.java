package com.techlab.adapter;

public class BirdAdapter implements IToyDuck {

	private IBird bird;

	public BirdAdapter(IBird bird) {
		this.bird = bird;
	}

	@Override
	public void squeak() {
		// TODO Auto-generated method stub
		bird.makeSound();
	}

}
