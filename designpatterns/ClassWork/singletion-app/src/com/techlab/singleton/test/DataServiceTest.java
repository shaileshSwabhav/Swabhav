package com.techlab.singleton.test;

import com.techlab.singleton.DataService;

public class DataServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataService s1 = DataService.getInstance();
		DataService s2 = DataService.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		s1.processData();
		s2.processData();
		
	}

}
