package com.techlab.employee;

import java.io.File;

public interface ILoadable {
	
	public void loadFile(String str) throws Exception;
	public File getCsvFile();
}
