package com.techlab.singleton;

public class DataService {
	
	private static DataService bucket;
	

	public static DataService getInstance() {
		if (bucket == null)
			bucket = new DataService();

		return bucket;
	}
	
	public void processData() {
		System.out.println(bucket.hashCode());
	}


}
