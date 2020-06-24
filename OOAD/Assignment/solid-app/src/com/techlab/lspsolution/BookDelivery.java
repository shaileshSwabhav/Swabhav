package com.techlab.lspsolution;

public class BookDelivery {

	private int userID;
	private String bookTitle;
	public BookDelivery(int userID, String bookTitle) {
		this.userID = userID;
		this.bookTitle = bookTitle;
	}
}
																								// here we have added 2 more classes for offline and online delivery
class OfflineDelivery extends BookDelivery {													// offline delivery will implement for physical delivery of book 

	public OfflineDelivery(int userID, String bookTitle) {
		super(userID, bookTitle);
	}
		
	public void getDeliveryLocation() {
		System.out.println("Delivery Location is: " + this.getClass().getSimpleName());
	}
}

class OnlineDelivery extends BookDelivery {														// online delivery will implement for online delivery of books
																								// by getting the available softwares
	public OnlineDelivery(int userID, String bookTitle) {
		super(userID, bookTitle);
	}
	
	public void getAvailableSoftware() {
		System.out.println("Availabe Software is: " + this.getClass().getSimpleName());
	}
}

class HandcoverDelivery extends OfflineDelivery {

	public HandcoverDelivery(int userID, String bookTitle) {
		super(userID, bookTitle);
	}
	
	@Override
	public void getDeliveryLocation() {
		System.out.println("Delivery Location is: " + this.getClass().getSimpleName());
	}
}

class AudioBookDelivery extends OnlineDelivery {

	public AudioBookDelivery(int userID, String bookTitle) {
		super(userID, bookTitle);
	}
	
	@Override
	public void getAvailableSoftware() {
		System.out.println("Availabe Software is: " + this.getClass().getSimpleName());
	}	
}