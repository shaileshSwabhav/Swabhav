package com.techlab.ispsolution;

public interface IBookAction {
	public void seeReview();
}

interface IHandBookAction extends IBookAction {
	public void secondhandBook();
}

interface IAudioBookAction extends IBookAction {
	public void listenSample();
}

// here we have segregated the interface so that they have less functionality

class HandBook implements IHandBookAction {

	@Override
	public void seeReview() {
		System.out.println("See Review" + this.getClass().getSimpleName());
	}

	@Override
	public void secondhandBook() {
		System.out.println("Second hand book: " + this.getClass().getSimpleName());
	}
	
}

class AudioBook implements IAudioBookAction {

	@Override
	public void seeReview() {
		System.out.println("See Review" + this.getClass().getSimpleName());
	}

	@Override
	public void listenSample() {
		System.out.println("Listen Sample: " + this.getClass().getSimpleName());
	}
	
}