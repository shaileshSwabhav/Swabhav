package com.techlab.socialemotional;

public class Man implements ISocializable, IEmotionable {

	@Override
	public void cry() {
		System.out.println("Man Crying");
	}

	@Override
	public void laugh() {
		System.out.println("Man Laughing");
	}

	@Override
	public void wish() {
		System.out.println("Man Wishing");
	}

	@Override
	public void depart() {
		System.out.println("Man Depart");
	}

}
