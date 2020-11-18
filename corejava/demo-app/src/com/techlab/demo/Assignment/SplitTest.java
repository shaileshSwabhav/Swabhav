package com.techlab.demo.Assignment;

public class SplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SplitTest sptest = new SplitTest();
		
		//String queryString = "https://www.google.com?developer=paras";
		
		String queryString = "www.techlab.com@swabhavtechlabs?training=java";
		
		// output = comapny name is swabhavtechlabs
		// training program is java
		// origin name is techlab

		//int end = queryString.indexOf("=");
		
		sptest.SplitCompanyDeveloper(queryString);
		
	}
	
	public void SplitCompanyDeveloper(String queryString) {
				
		String [] str1 = queryString.split("[@?]");
		String [] str2 = queryString.split("[=]");
		String [] str3 = queryString.split("[.]");

		
//		for (String z : x) {
//			System.out.println(z);
//		}
//		
		if (str1[1].length() == 0) {
			str1[1] = null;
		}
		if (str2[1].length() == 0) {
			str2[1] = null;
		}
		if (str3[1].length() == 0) {
			str3[1] = null;
		}
		System.out.println("Company name is : " + str1[1]);
		System.out.println("Training name is : " + str2[1]);
		System.out.println("Origin name is : " + str3[1]);
	}
}