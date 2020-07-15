package com.techlab.template;

public class StoreOrder extends OrderProcessTemplate {

	@Override
	public void doSelect() {
		// TODO Auto-generated method stub
        System.out.println("Customer chooses the item from shelf."); 
	}

	@Override
	public void doPayment() {
		// TODO Auto-generated method stub
        System.out.println("Pays at counter through cash/POS"); 
	}

	@Override
	public void doDelivery() {
		// TODO Auto-generated method stub
        System.out.println("Item deliverd to in delivery counter."); 
	}

}
