package com.techlab.contact;

import java.io.*;
import java.util.*;

public class ContactManager extends Contact {

	private final static String FILENAME = "src/resource/FileIoOperation.txt";

	public ContactManager() {
		super();
	}

	public ContactManager(String firstName, String lastName, long phoneNo, String emailID) {
		super(firstName, lastName, phoneNo, emailID);
	}

	public void addToContacts(ArrayList<ContactManager> am) throws Exception {

		FileOutputStream file = new FileOutputStream(FILENAME);
		ObjectOutputStream out = new ObjectOutputStream(file);

		out.writeObject(am);

		out.flush();
		out.close();
	}

	public void modifyContactByName(String modifyName, String newName) throws Exception {

		ObjectInputStream in = deserializeContacts();

		ArrayList<ContactManager> am = displayContactList();

		int i = findContact(am, modifyName);
		if (i != -1) {
			am.get(i).setFirstName(newName);
			addToContacts(am);

		} else {
			throw new ContactNotFoundException();
		}
		in.close();
	}

	public ArrayList<ContactManager> searchContactByName(String searchContact) throws Exception {

		ObjectInputStream in = deserializeContacts();

		ArrayList<ContactManager> am = displayContactList();
		ArrayList<ContactManager> am1 = new ArrayList<ContactManager>();

		int i = findContact(am, searchContact);
		if (i != -1) {
			am1.add(am.get(i));
		} else {
			throw new ContactNotFoundException();
		}
		in.close();
		return am1;

	}

	public void deleteContactByName(String deleteContact) throws Exception {

		ObjectInputStream in = deserializeContacts();

		ArrayList<ContactManager> am = displayContactList();

		int i = findContact(am, deleteContact);
		if (i != -1) {
			am.remove(i);

			addToContacts(am);
		} else {
			throw new ContactNotFoundException();
		}
		in.close();

	}

	public static ArrayList<ContactManager> displayContactList() throws Exception {

		ArrayList<ContactManager> contact;
		FileInputStream file = new FileInputStream(FILENAME);
		ObjectInputStream in = new ObjectInputStream(file);

		contact = (ArrayList<ContactManager>) in.readObject();

		in.close();

		return contact;
	}

	public ObjectInputStream deserializeContacts() throws Exception {

		FileInputStream file = new FileInputStream(FILENAME);
		ObjectInputStream in = new ObjectInputStream(file);

		return in;
	}

	public static int findContact(ArrayList<ContactManager> contacts, String contactName) {

		int x = -1;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getFirstName().equals(contactName)) {
				x = i;
			}
		}
		return x;
	}

}
