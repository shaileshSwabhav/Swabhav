package com.techlab.custom.annotation.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

import com.techlab.custom.annotation.CustomAnnotation;

public class CustomAnnotationTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		CustomAnnotation c = new CustomAnnotation();

		printNumberOfAnnotation(c);

		checkCases(c);
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
		System.out.println("No. of annotations: " + countAnnotation + "\n");
	}

	public static void checkCases(CustomAnnotation c) throws Exception {

		int countPassedCases = 0, countFailedCases = 0;
		boolean isTrue = true;
		
		Method[] method = c.getClass().getDeclaredMethods();
		/*
		 * for (Method m : method) { m.setAccessible(true); boolean value = (boolean)
		 * m.invoke(c, null); if (value == checkValue) { countCases++;
		 * System.out.println(m.getName()); } }
		 */
		
		for (Method m : method) {

			Annotation[] annot = m.getDeclaredAnnotations();
			for (Annotation a : annot) {

				m.setAccessible(true);
				boolean value = (boolean) m.invoke(c, null);
				if (value == isTrue) {
					countPassedCases++;
//					System.out.println(m.getName());
				} else {
					countFailedCases++;
				}
			}
		}
		
		System.out.println("Number of Passed Cases: " + countPassedCases);
		System.out.println("Number of Failed Cases: " + countFailedCases);
	}
}
