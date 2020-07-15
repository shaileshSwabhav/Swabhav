package com.tech.factory.demo.test;

import com.tech.factory.demo.*;

public class NotificationTest {
	
	public static void main(String args[]) {
		
		 NotificationFactory notificationFactory = new NotificationFactory(); 
		 Notification notification = notificationFactory.createNotification("SMS"); 
		 notification.userNotify();
		
	}
  
}
