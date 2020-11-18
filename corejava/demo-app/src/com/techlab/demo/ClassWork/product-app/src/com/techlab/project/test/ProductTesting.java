package com.techlab.project.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

public class ProductTesting {

	@Test
	public void testEmptyCollection() {
		Collection collection = new ArrayList();
		assertTrue(collection.isEmpty());
	}

}
