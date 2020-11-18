package com.techlab.serialization;

import java.io.Serializable;

public class SerializableDemo implements Serializable {

	public int a;
	public String b;
	
	public SerializableDemo(int a, String b) {
		this.a = a;
		this.b = b + " hi";
	}

}
