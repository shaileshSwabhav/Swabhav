package com.techlab.employee;

import java.io.*;
import java.net.*;

public class URLLoader implements ILoadable {

	@Override
	public File loadFile(String webURL) throws Exception {
		// TODO Auto-generated method stub

		URL url = new URL(webURL);
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;
		File csvFile = new File("src/resource/webEmp_data.txt");
		FileWriter file = new FileWriter(csvFile);
		while ((inputLine = in.readLine()) != null) {
			file.write(inputLine + "\n");
		}
		file.close();
		in.close();

	return csvFile;
	}

}
