package com.techlab.rectangle.test;
import com.techlab.rectangle.*;

public class RectangleArrayOfObject {
	
	public static void main(String [] args) {
		
		Rectangle [] r = new Rectangle[3];
		
		r[0] = new Rectangle();
		r[0].setLength(15.6f);
		r[0].setBreadth(11.9f);
		
		Rectangle r1 = new Rectangle();
		r1.setLength(10.4f);
		r1.setBreadth(11.4f);
		
		Rectangle r2 = new Rectangle();
		r2.setLength(14.4f);
		r2.setBreadth(18.4f);
		
		r[1] = r1;	
		r[2] = r2;
		
		printInfo(r);
				
	}
	
	public static void printInfo(Rectangle [] r) {
		
		for (int i = 0; i < r.length; i++) {
			System.out.println("HashCode: " + r[i].hashCode());
			System.out.println("Length: " + r[i].getLength());
			System.out.println("Breadth: " + r[i].getBreadth());
		}
		
	}

}
