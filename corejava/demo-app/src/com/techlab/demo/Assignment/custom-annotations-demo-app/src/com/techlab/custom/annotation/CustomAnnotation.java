package com.techlab.custom.annotation;

import java.lang.annotation.*;

public class CustomAnnotation {

	@TestCase
	public boolean m1() {
		return true;
	}

	@TestCase
	public boolean m2() {
		return true;
	}

	@TestCase
	public boolean m3() {
		return false;
	}
	
	public boolean m4() {
		return true;
	}
	
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface TestCase{
		
	}

}
