package com.techlab.demo;

public class OverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		boolean z = true;
		OverloadingTest overload = new OverloadingTest();
		
		overload.printInfo(a);
		overload.printInfo(z);

	}	
		
		public void printInfo(int x) {
			System.out.println("Integer is : " + x);
		}
		
		public void printInfo(char x) {
			System.out.println("Char is : " + x);
		}
		
		public void printInfo(long x) {
			System.out.println("Long is : " + x);
		}
		
		public void printInfo(String x) {
			System.out.println("String is : " + x);
		}
		
		public void printInfo(boolean x) {
			System.out.println("Boolean is : " + x);
		}
		
		public void printInfo(float x) {
			System.out.println("Float is : " + x);
		}
		
		public void printInfo(double x) {
			System.out.println("Double is : " + x);
		}
		
		public void printInfo() {
			System.out.println();
		}
	

}
