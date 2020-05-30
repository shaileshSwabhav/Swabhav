package com.techlab.crudable;

public class AddressDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Creating Address Db");
	}

	@Override
	public void read() {
		System.out.println("Read Address Db");
	}

	@Override
	public void update() {
		System.out.println("Update Adress Db");
	}

	@Override
	public void delete() {
		System.out.println("Delete Address Db");
	}

}
