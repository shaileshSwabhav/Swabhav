package com.techlab.demo.ClassWork.Dry;
import java.util.*;

public class WithoutDryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int [] arr1 = new int[5];
		int [] arr2 = new int[7];
		int [] arr3 = new int[10];
 		
		System.out.println("Array 1");
		for (int i = 0; i < arr1.length ; i++) {
			arr1[i] = scan.nextInt();
		}
		
		System.out.println("Array 2");
		for (int i = 0; i < arr2.length ; i++) {
			arr2[i] = scan.nextInt();
		}
		
		System.out.println("Array 3");
		for (int i = 0; i < arr3.length ; i++) {
			arr3[i] = scan.nextInt();
		}

		scan.close();
		
		System.out.println("Array 1");
		for (int x: arr1) {
			System.out.println(x);
		}
		System.out.println("Array 2");
		for (int y: arr2) {
			System.out.println(y);
		}
		System.out.println("Array 3");
		for(int z: arr3) {
			System.out.println(z);
		}

	}
}
