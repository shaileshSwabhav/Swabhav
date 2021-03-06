package com.techlab.composite.folder.test;

import com.techlab.composite.folder.*;

public class StorableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		
		Folder movieFolder = new Folder("movie");
		Folder actionFolder = new Folder("action");
		Folder comedyFolder = new Folder("comedy");
		Folder actionFolder1 = new Folder("actionFolder1");


		File abcFile = new File("abc", 100, "avi");
		File defFile = new File("def", 100, "mp4");
		File mnoFile = new File("mno", 100, "avi");
		File pqrFile = new File("pqr", 100, "mp4");
		File xyzFile = new File("xyz", 100, "avi");
		File ghiFile = new File("ghi", 100, "mp4");
		
		actionFolder.addChilder(abcFile);
		actionFolder.addChilder(defFile);
		actionFolder.addChilder(mnoFile);
		actionFolder.addChilder(actionFolder1);

		comedyFolder.addChilder(pqrFile);
		comedyFolder.addChilder(xyzFile);
		comedyFolder.addChilder(ghiFile);
		
		movieFolder.addChilder(actionFolder);
		movieFolder.addChilder(comedyFolder);
		
		
		movieFolder.display(sb.append("--"));

	}

}
