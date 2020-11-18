package com.techlab.crudable;

public class CustomerDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Creating Customer Db");
	}

	@Override
	public void read() {
		System.out.println("Read Customer Db");
	}

	@Override
	public void update() {
		System.out.println("Update Customer Db");
	}

	@Override
	public void delete() {
		System.out.println("Delete Customer Db");
	}
	
}
