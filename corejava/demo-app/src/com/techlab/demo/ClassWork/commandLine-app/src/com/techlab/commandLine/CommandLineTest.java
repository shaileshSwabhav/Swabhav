package com.techlab.commandLine;

import java.util.*;

public class CommandLineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Even Numbers are: ");
		for (int i = 0; i < args.length - 1; i++) {
			if (Integer.parseInt(args[i]) % 2 == 0) {
				System.out.print(args[i] + " ");
			}
		}
		System.out.println();

		System.out.print("Odd Numbers are: ");
		for (int i = 0; i < args.length - 1; i++) {
			if (Integer.parseInt(args[i]) % 2 != 0) {
				System.out.print(args[i] + " ");
			}
		}
	
	}

}
