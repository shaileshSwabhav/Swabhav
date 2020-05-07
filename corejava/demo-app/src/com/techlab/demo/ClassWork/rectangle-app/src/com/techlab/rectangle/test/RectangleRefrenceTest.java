	package com.techlab.rectangle.test;
import com.techlab.rectangle.Rectangle;


public class RectangleRefrenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1=new Rectangle(); 

		Rectangle r2;

		r2=r1;

		r2.setBreadth(10.4f);
		r2.setLength(12.5f);
		
		
		r2.setBreadth((r2.getBreadth()+1.0f));
		r2.setLength((r2.getLength()+1.0f));  
		
		System.out.println("Main: " + r1.hashCode() + " " + r2.hashCode());
		
		printInfo(r1); 
		printInfo(r2);

	}
	
	public static void printInfo(Rectangle r) {
		
		System.out.println(r.getLength());
		System.out.println(r.getBreadth());
		System.out.println(r.getColor());
		
		System.out.println("printInfo: " + r.hashCode());


		
	}

}
