package com.techlab.ispviolation;

public interface IBookAction {

	public void seeReview();
	public void searchSecondHandBook();
	public void listenSample();
}

class HandBook implements IBookAction {

	@Override
	public void seeReview() {
		System.out.println("Book Review is: " + this.getClass().getSimpleName());
	}

	@Override
	public void searchSecondHandBook() {
		System.out.println("This is second hand book" + this.getClass().getSimpleName());
	}

	@Override
	public void listenSample() {
		throw new RuntimeException("Handbook dooesn't have sample to listen");
	}
	
}

class AudioBook implements IBookAction {

	@Override
	public void seeReview() {
		System.out.println("Book Review is: " + this.getClass().getSimpleName());
	}

	@Override
	public void searchSecondHandBook() {
		throw new RuntimeException("Audio book does not have second hand book");
	}

	@Override
	public void listenSample() {
		System.out.println("This is sample for the audio book" + this.getClass().getSimpleName());
	}	
}

// here we have some actions which user can perform regarding a book
// but we have 2 types of book. one is physical book and another is the audio book
// but as the BookAction interface is having all the methods for all the actions that user can perform for book
// we are violating the ISP
// as AudiBook cannot have a secondHandBook and physical book cannot have listen sample.