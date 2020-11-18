package com.techlab.rectangle.test;
import com.techlab.rectangle.Rectangle;


public class RectangleAnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.out.println(new Rectangle()); 
				System.out.println("Inside main: " + new Rectangle().hashCode());
								
				new Rectangle().setLength(5);
				new Rectangle().setBreadth(10);
				System.out.println(new Rectangle().getLength());  
				System.out.println(new Rectangle().getBreadth());

				printInfo(new Rectangle());

	}
	
	public static void printInfo(Rectangle r) {
		
		System.out.println("Inside method: " +r.hashCode());
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		System.out.println(r.calculateArea());
	}

}
