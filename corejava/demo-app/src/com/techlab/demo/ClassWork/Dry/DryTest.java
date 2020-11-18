package com.techlab.demo.ClassWork.Dry;
import java.util.*;

public class DryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
DryTest test = new DryTest();
		
		int [] arr1 = new int[5];
		int[] arr2 = new int[7];
		int [] arr3 = new int[10];
		
		System.out.println("Array 1");
		test.dry(arr1);
		
		System.out.println("Array 2");
		test.dry(arr2);
		
		System.out.println("Array 3");
		test.dry(arr3);
		
		System.out.println("Display the array elements");
		
		System.out.println("Array 1");
		test.display(arr1);
		
		System.out.println("Array 2");
		test.display(arr2);
		
		System.out.println("Array 3");
		test.display(arr3);
	}

	void dry(int [] arr) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}	
		
		scan.close();
	}
	
	void display(int [] arr) {
		
		for(int x: arr) {
			System.out.println(x);
		}		

	}

}
