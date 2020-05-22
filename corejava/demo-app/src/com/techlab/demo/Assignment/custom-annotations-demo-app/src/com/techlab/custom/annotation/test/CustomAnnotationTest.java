package com.techlab.custom.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

import com.techlab.custom.annotation.CustomAnnotation;

public class CustomAnnotationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		CustomAnnotation c = new CustomAnnotation();

		printNumberOfAnnotation(c);
		
		System.out.println("Passed cases:");
		int countPassedCases = checkCases(c, true);
		System.out.println("Passed cases count: " + countPassedCases + "\n");

		System.out.println("Failes cases:");
		int countFailedCases = checkCases(c, false);
		System.out.println("Failed cases count: " + countFailedCases);
	}

	public static void printNumberOfAnnotation(CustomAnnotation c) {

		int countAnnotation = 0;
		Method[] method = c.getClass().getMethods();
		for (Method m : method) {

			Annotation[] annot = m.getDeclaredAnnotations();
			for (Annotation a : annot) {
			countAnnotation++;
			}
		}
		System.out.println("No. of annotations: " + countAnnotation+ "\n");
	}

	public static int checkCases(CustomAnnotation c, boolean checkValue) throws Exception {

		int countCases = 0;
		Method[] method = c.getClass().getDeclaredMethods();
/*		for (Method m : method) {
			m.setAccessible(true);
			boolean value = (boolean) m.invoke(c, null);
			if (value == checkValue) {
				countCases++;
				System.out.println(m.getName());
			}
		}
*/		
		for (Method m : method) {

			Annotation[] annot = m.getDeclaredAnnotations();
			for (Annotation a : annot) {
			
				m.setAccessible(true);
				boolean value = (boolean) m.invoke(c, null);
				if (value == checkValue) {
					countCases++;
					System.out.println(m.getName());
				}

			}

		}
		return countCases;
	}
}
