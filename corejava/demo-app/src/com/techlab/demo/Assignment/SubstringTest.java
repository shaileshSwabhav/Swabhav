package com.techlab.demo;

public class SubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubstringTest substrTest = new SubstringTest();
		
		String str = "https://www.swabhavtechlabs.com?developer=Shailesh";
		
		int beginComapny = str.indexOf('.');
		int endComapny = str.indexOf(".com");
		substrTest.subStringPrint(str, beginComapny, endComapny);
		
		int beginDeveloper = str.indexOf("=");
		substrTest.subStringPrint(str, beginDeveloper);		
	}
	
	public void subStringPrint(String str, int begin, int end) {
		
		String x = str.substring(begin+1, end);
		if (x.length() == 0) {
			x = null;
		}
		System.out.println("Company name is : " + x);
	}
	
	public void subStringPrint(String str, int begin) {
		
		String x = str.substring(begin+1);
		if (x.length() == 0) {
			x = null;
		}
		System.out.println("Developer name is : " + x);
	}

}
