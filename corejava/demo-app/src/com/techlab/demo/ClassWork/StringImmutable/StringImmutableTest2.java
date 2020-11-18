package com.techlab.demo.ClassWork.StringImmutable;

public class StringImmutableTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String foo = "FOO";
		String bar = "BAR";
		String foo1 = "bar";

		System.out.println(foo == bar); // false
		System.out.println(foo);
		System.out.println(bar);
		System.out.println(bar == foo); // false
		System.out.println(foo.equals(bar)); // false
		System.out.println(bar.equals(foo)); // false
		System.out.println(foo1 == foo); // false

	}
}

//no mam its false that was other output
//yes
// mam actually i was studying it didnt understand