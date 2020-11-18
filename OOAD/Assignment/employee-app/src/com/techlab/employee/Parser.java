package com.techlab.employee;

import java.io.*;
import java.util.*;

public class Parser {

	private HashSet<String> empData;
	private ILoadable load;
	
	public Parser(ILoadable load) {
		this.load = load;
		empData = new HashSet<String>();
	}

	public void parseFile(String location) throws Exception {
		
		load.loadFile(location);
		File file = load.getCsvFile();
		Scanner scan = new Scanner(file);
		
		while (scan.hasNext()) {
			empData.add(scan.next());			
			
		}
	
		scan.close();
	}

	public HashSet<String> getEmpData() {
		return empData;
	}

}
