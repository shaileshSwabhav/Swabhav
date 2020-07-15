package com.techlab.template.test;

import com.techlab.template.*;

public class TemplateMethodPatternClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrderProcessTemplate netOrder = new NetOrder();
		netOrder.processOrder(true);
		
		System.out.println();
		
		OrderProcessTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder(true);

	}

}
