package com.techlab.junit;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.*;
import static org.junit.Assert.*;
 

public class BasicTest {

	@Test
	public void testEmptyCollection() {
		Collection collection = new ArrayList();
		assertTrue(collection.isEmpty());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		org.junit.runner.JUnitCore.main("com.techlab.project.test.ProductTesting");

	}

}
