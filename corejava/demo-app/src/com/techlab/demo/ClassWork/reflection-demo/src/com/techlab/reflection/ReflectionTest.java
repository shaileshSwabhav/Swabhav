package com.techlab.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.techlab.person.*;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

//		Object o = new Object();

		Person o = new Person();

		printMethodInfo(o);
		printConstructorInfo(o);
		printGettersInfo(o);
		printSettersInfo(o);
		printPrivateMethod(o);
		printPrivateFields(o);

	}

	public static void printMethodInfo(Person o) throws Exception {

		System.out.println("Methods");
		Method[] method = o.getClass().getMethods();

		for (Method m : method) {
			System.out.println(m.getName());
		}

	}

	public static void printConstructorInfo(Person o) {

		System.out.println("\nConstructors");
		Constructor[] constructor = o.getClass().getConstructors();

		for (Constructor c : constructor) {
			System.out.println(c.getName());
		}
	}

	public static void printGettersInfo(Person o) {

		System.out.println("\nGetters");
		Method[] method = o.getClass().getMethods();

		for (Method m : method) {
			if ((m.getName()).contains("get")) {
				System.out.println(m.getName());
			}
		}
	}

	public static void printSettersInfo(Person o) {

		System.out.println("\nSetters");
		Method[] method = o.getClass().getMethods();

		for (Method m : method) {
			if ((m.getName()).contains("set")) {
				System.out.println(m.getName());
			}
		}
	}

	public static void printPrivateMethod(Person o) throws Exception {

		System.out.println("\nPrivate Methods");
		Method[] method = o.getClass().getDeclaredMethods();

		for (Method m : method) {
			if (Modifier.isPrivate(m.getModifiers())) {
				System.out.println(m.getName());
			}
		}
	}
	
	public static void printPrivateFields(Person o) {
		
		System.out.println("\nPrivate Fields");
		Field [] field = o.getClass().getDeclaredFields();
		
		for (Field f: field) {
			if (Modifier.isPrivate(f.getModifiers())) {
				System.out.println(f.getName());
			}
		}
		
	}

}
