package com.techlab.singleton.demo.test;

import com.techlab.singleton.demo.Singleton;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Singleton x = Singleton.getInstance(); 
  
        Singleton y = Singleton.getInstance(); 
  
        Singleton z = Singleton.getInstance(); 
  
        x.s = (x.s).toUpperCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
  
        z.s = (z.s).toLowerCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 		
		
	}

}
