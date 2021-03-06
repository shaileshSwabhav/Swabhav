package com.techlab.demo.Assignment;

import java.lang.reflect.*;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		Class c = Class.forName("com.techlab.demo.Assignment.ReflectionDemo");
//		ReflectionDemo d = (ReflectionDemo) c.newInstance();

		ReflectionDemo d = new ReflectionDemo();
		
		Method m = d.getClass().getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(d, null);
		
		System.out.println("Is interface: " + d.getClass().isInterface());
		System.out.println("superclass: " + d.getClass().getSuperclass());
		
		Method[] method = d.getClass().getMethods();
		for(Method x : method) {
			System.out.println(x.getName());
		}
		
		Field[] field = d.getClass().getDeclaredFields();
//		System.out.println(field);
		
		for(Field f: field) {
			System.out.println("public string " + f.getName());
		}
		

	}

}
