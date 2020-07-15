package com.techlab.template;

public class NetOrder extends OrderProcessTemplate {

	@Override
	public void doSelect() {
		// TODO Auto-generated method stub
		System.out.println("Item added to online shopping cart");
		System.out.println("Get gift wrap preference");
		System.out.println("Get delivery address.");
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
		System.out.println("Online Payment through Netbanking, card or Paytm");
	}

	@Override
	public void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Ship the item through post to delivery address");
	}

}
