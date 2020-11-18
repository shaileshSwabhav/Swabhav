package com.techlab.lspviolation.test;

import com.techlab.lspviolation.*;

public class CalculateAreaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle(4, 7);
		Rectangle s = new Square(4);

		if (shouldNotChangeWidthIfHeightChanges(r))
			System.out.println("Rectangle Area: " + r.calculateArea());
		else
			System.out.println("Square Area: " + r.calculateArea());
		
		
		if (shouldNotChangeWidthIfHeightChanges(s))
			System.out.println("Rectangle Area: " + s.calculateArea());
		else
			System.out.println("Square Area: " + s.calculateArea());
	}
	
	public static boolean shouldNotChangeWidthIfHeightChanges(Rectangle r) {
		
		int before = r.getWidth();
		r.setHeight(r.getHeight() + 10);
		int after = r.getWidth();
		
		if (before == after) {
			return true;
		} else {
			return false;
		}
		
	}

}
