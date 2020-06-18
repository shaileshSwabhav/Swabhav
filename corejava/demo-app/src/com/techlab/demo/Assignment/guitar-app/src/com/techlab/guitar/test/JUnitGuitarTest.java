package com.techlab.guitar.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.techlab.guitar.*;

class JUnitGuitarTest {

	@Test
	void testAddGuitar() {

		// Arrange
		String expectedserialNumber = "12abc";
		double expectedPrice = 500;
		Builder expectedBuilder = Builder.FENDER;
		String expectedModel = "xyz";
		Type expectedType = Type.ACOUSTIC;
		Wood expectedBackWood = Wood.ALDER;
		Wood expectedTopWood = Wood.ALDER;

		// Act
		Inventory i = new Inventory();
		GuitarSpecs s = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		Guitar g = new Guitar("12abc", 500, s);
		i.addGuitar(g);

		// Assert
		assertEquals(expectedserialNumber, g.getSerialNumber());
		assertEquals(expectedPrice, g.getPrice());
		assertEquals(expectedBuilder, s.getBuilder());
		assertEquals(expectedModel, s.getModel());
		assertEquals(expectedType, s.getType());
		assertEquals(expectedBackWood, s.getBackWood());
		assertEquals(expectedTopWood, s.getTopWood());
	}

	@Test
	void testGetGuitar() {

		// Arrange
		String expectedSerialNumber = "12abc";
		double expectedPrice = 500;
		Builder expectedBuilder = Builder.FENDER;
		String expectedModel = "xyz";
		Type expectedType = Type.ACOUSTIC;
		Wood expectedBackWood = Wood.ALDER;
		Wood expectedTopWood = Wood.ALDER;

		// Act
		Inventory i = new Inventory();
		GuitarSpecs s = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		Guitar g = new Guitar("12abc", 500, s);
		i.addGuitar(g);

		Guitar getGuitar = i.getGuitar("12abc");
		GuitarSpecs spec = getGuitar.getSpec();

		// Assert
		assertEquals(expectedSerialNumber, getGuitar.getSerialNumber());
		assertEquals(expectedPrice, getGuitar.getPrice());
		assertEquals(expectedBuilder, spec.getBuilder());
		assertEquals(expectedModel, spec.getModel());
		assertEquals(expectedType, spec.getType());
		assertEquals(expectedBackWood, spec.getBackWood());
		assertEquals(expectedTopWood, spec.getTopWood());
		
	}

	@Test
	void testSearch() {

		// Arrange
		Builder expectedBuilder = Builder.FENDER;
		String expectedModel = "xyz";
		Type expectedType = Type.ACOUSTIC;
		Wood expectedBackWood = Wood.ALDER;
		Wood expectedTopWood = Wood.ALDER;
		int expectedSize = 4;

		// Act
		Inventory i = new Inventory();
		GuitarSpecs s = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		Guitar g = new Guitar("12abc", 500, s);
		i.addGuitar(g);

		GuitarSpecs searchSpec = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		List spec = i.search(searchSpec);

		assertEquals(expectedSize, spec.size());
		
		// Assert
//		for (Iterator i1 = spec.iterator(); i1.hasNext();) {
//			Guitar guitar = (Guitar) i1.next();
//			GuitarSpecs x = guitar.getSpec();
//			assertEquals(expectedBuilder, x.getBuilder());
//			assertEquals(expectedModel, x.getModel());
//			assertEquals(expectedType, x.getType());
//			assertEquals(expectedBackWood, x.getBackWood());
//			assertEquals(expectedTopWood, x.getTopWood());
//		}
	}
	
	@Test
	void testMatches() {
		
		// Arrange
		boolean expectedResult = true;
		
		// Act
		Inventory i = new Inventory();
		GuitarSpecs s = new GuitarSpecs(Builder.FENDER, "xyz", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		Guitar g = new Guitar("12abc", 500, s);
		i.addGuitar(g);
		
		boolean result = s.matches(s);
		
		// Assert
		assertEquals(expectedResult, result);
		
		
	}

}
