package com.techlab.demo.Assignment;
import java.util.*;

public class StringImmutabilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		StringImmutabilityTest stringImmutable = new StringImmutabilityTest();
		stringImmutable.stringImmute();

		
	}

	void stringImmute() {
		
		String str = "Java";
		String str1 = str;
		
		System.out.println("Before changing str and str1 : " + str + " " + str1);
		
		str = "code";

		System.out.println("After changing str and str1 : " + str + " " + str1);
	}
	
}


// mutable is we have access to modify
// bcoz String class ko final set kiya hai so we cannot change the string object
// str object which refers to "java"
// no
// yes
//ok
//ok bye
//yes


// Can we modify objects value if its class do not have final keyword.
// final keyword means that reference cannot be changed
// but the variable can be modified.

//String is immutable 
// to improve security and performance
// security because if string is mutable then anyone can change the string value
// and performance in increase bcoz hashCode does not change
// has there is no need to calculate hashCode again and again.
// they can also increase thread safety has the objects cannot be modified
// so the objs can be shared btw threads 