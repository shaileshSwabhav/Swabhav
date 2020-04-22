package com.techlab.demo.Assignment;

public class SubstringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubstringTest substrTest = new SubstringTest();
		
		String queryString = "https://www.google.com?developer=paras";
		
		int beginComapny = queryString.indexOf('.');
		int endComapny = queryString.indexOf(".com");
		substrTest.subStringPrint(queryString, beginComapny, endComapny);
		
		int beginDeveloper = queryString.indexOf("=");
		substrTest.subStringPrint(queryString, beginDeveloper);		
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
