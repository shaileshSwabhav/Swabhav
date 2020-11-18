package com.techlab.employee;

import java.io.*;

public class FileLoader implements ILoadable {

	private File csvFile;

	@Override
	public void loadFile(String fileLocation) throws Exception {
		
		csvFile = new File(fileLocation);
	}

	public File getCsvFile() {
		return csvFile;
	}

}
