package com.techlab.dipsolution;

public class XmlLogger implements ILogable {

	@Override
	public void log(String logError) {
		System.out.println("Printing error to XML file");
		System.out.println(logError);

	}

}
