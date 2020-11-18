package com.techlab.lspviolation;

public class BookDelivery {
																	// here we have a book shop which is delivering books to its customers
	private int userID;
	private String bookTitle;

	public BookDelivery(int userID, String bookTitle) {
		this.userID = userID;
		this.bookTitle = bookTitle;
	}

	public void getBookDeliveryLocation() {
		System.out.println("Book Deilvery");
	}
}
																		// then the book shop also thought of delivering the hardcover
class HardcoverDelivery extends BookDelivery {							// so we extend it to BookDelivery class and override its methods
																		// with its own implementation
	public HardcoverDelivery(int userID, String bookTitle) {
		super(userID, bookTitle);
	}
	
	@Override
	public void getBookDeliveryLocation() {
		System.out.println("Home delivery of the book");
	}
}
																		// now the book shop is also selling AudioBooks
class AudioBookDelivery extends BookDelivery {							// so we have to deliver Audio Books to the customer	
																		// but audio book cannot override getDeliveryLocation
	public AudioBookDelivery(int userID, String bookTitle) {			// as they cannot be delivered physically
		super(userID, bookTitle);
	}
	
	@Override
	public void getBookDeliveryLocation() {
		throw new RuntimeException("Audio book cannot be physically delivered");
	}
}