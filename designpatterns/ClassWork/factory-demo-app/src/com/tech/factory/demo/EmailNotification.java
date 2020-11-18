package com.tech.factory.demo;

public class EmailNotification implements Notification {

	@Override
	public void userNotify() {
		// TODO Auto-generated method stub
        System.out.println("Sending an e-mail notification"); 
	} 

}
