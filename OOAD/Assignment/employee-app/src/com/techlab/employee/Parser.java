package com.techlab.employee;

import java.io.*;
import java.util.*;

public class Parser {

	HashSet<String> empData;
	
	public Parser() {
		empData = new HashSet<String>();
	}

	public HashSet<String> parseFile(File file) throws Exception {

		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			empData.add(scan.next());
		}
	
		scan.close();
		return empData;
	}

}
