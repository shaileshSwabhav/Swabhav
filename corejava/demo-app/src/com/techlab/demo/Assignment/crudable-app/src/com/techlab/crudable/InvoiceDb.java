package com.techlab.crudable;

public class InvoiceDb implements ICrudable {

	@Override
	public void create() {
		System.out.println("Creating Invoice Db");
	}

	@Override
	public void read() {
		System.out.println("Read Invoice Db");
	}

	@Override
	public void update() {
		System.out.println("Update Invoice Db");
	}

	@Override
	public void delete() {
		System.out.println("Delete Invoice Db");
	}

}
