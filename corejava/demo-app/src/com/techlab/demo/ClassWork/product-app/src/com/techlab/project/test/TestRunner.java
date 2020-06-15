package com.techlab.project.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("com.techlab.project.test.ProjectTest");

//		for (Failure failure : result.getFailures()) {
//			System.out.println(failure.toString());
//		}


	}
}
