package com.techlab.employee;

import java.io.*;

public class FileLoader implements ILoadable {

	@Override
	public File loadFile(String fileLocation) throws Exception {
		// TODO Auto-generated method stub
		
		File csvFile = new File(fileLocation);
		
		return csvFile;
	}

}
