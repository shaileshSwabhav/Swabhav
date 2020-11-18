package com.techlab.adapter.test;

import com.techlab.adapter.*;

public class TestBirdAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Sparrow sparrow = new Sparrow(); 
        IToyDuck toyDuck = new PlasticDuck(); 
 
        IToyDuck birdAdapter = new BirdAdapter(sparrow); 
  
        System.out.println("Sparrow"); 
        sparrow.fly(); 
        sparrow.makeSound(); 
  
        System.out.println("ToyDuck"); 
        toyDuck.squeak(); 
  
        System.out.println("BirdAdapter"); 
        birdAdapter.squeak();
		
	}

}
