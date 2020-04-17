package com.techlab.demo;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SplitTest sptest = new SplitTest();
		
		String str = "https://www.swabhavtechlabs.com?developer=Shailesh";
		int end = str.indexOf("=");
		
		sptest.SplitCompanyDeveloper(str, end);
		
	}
	
	public void SplitCompanyDeveloper(String str, int end) {
		
		String[] x = str.split("\\.|=", end);
		
		if (x[1].length() == 0) {
			x[1] = null;
		}
		if (x[x.length-1].length() == 0) {
			x[x.length-1] = null;
		}
		System.out.println("Company name is : " + x[1]);
		System.out.println("Developer name is : " + x[x.length-1]);
		
	}
}