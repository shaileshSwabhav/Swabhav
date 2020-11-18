package com.techlab.guitar.test;

import java.util.Iterator;
import java.util.List;

import com.techlab.guitar.*;

public class GuitarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inventory inventory = new Inventory();

		inventory.addGuitar("XYZ101", 1203.42, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,
				12);

		GuitarSpecs sam = new GuitarSpecs(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER,
				12);
		
		List matchingGuitars = inventory.search(sam);
		 if (!matchingGuitars.isEmpty()) {      
			 System.out.println("Erin, you might like these guitars: ");      
			 for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {        
				 Guitar guitar = (Guitar)i.next();        
				 GuitarSpecs spec = guitar.getSpec();        
				 System.out.println("  We have a " +          
						 spec.getBuilder() + " " + spec.getModel() + " " +          
						 spec.getType() + " guitar:\n     " +          
						 spec.getBackWood() + " back and sides,\n     " +          
						 spec.getTopWood() + " top.\n  You can have it for only $" +          
						 guitar.getPrice() + "!\n  ----");      
								 }    
			 } else {      
				 System.out.println("Sorry, Erin, we have nothing for you.");    }
		
	}

}
