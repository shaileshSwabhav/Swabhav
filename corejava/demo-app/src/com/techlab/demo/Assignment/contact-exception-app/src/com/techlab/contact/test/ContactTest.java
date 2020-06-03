package com.techlab.contact.test;

import java.util.*;

import com.techlab.contact.*;

public class ContactTest {

	static Scanner scan = new Scanner(System.in);
//	private static String firstName, lastName, emailID;
//	private static long phoneNo;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ContactManager c = new ContactManager();
		ArrayList<ContactManager> am = new ArrayList<ContactManager>();

		boolean exit = false;
		final int ADD_CONTACT = 1, MODIFY_CONTACT = 2, SEARCH_CONTACT = 3, DELETE_CONTACT = 4, DISPLAY_CONTACT = 5,
				EXIT = 6;

		System.out.println("Enter your choice");
		System.out.println("1. Add Contact." + "\n2. Modify Contact." + "\n3. Search Contact." + "\n4. Delete Contact."
				+ "\n5. Display Contact" + "\n6. Exit");

		int choice = scan.nextInt();

		do {

			switch (choice) {

			case ADD_CONTACT:
				c = addContact(am);
				c.addToContacts(am);
				System.out.println("Contact Added!\n");

				break;

			case MODIFY_CONTACT:
				System.out.print("Enter name which should be modified: ");
				String modifyName = scan.next();
				System.out.print("Enter new name: ");
				String newName = scan.next();
				try {
					c.modifyContactByName(modifyName, newName);
					System.out.println("Contact Modified");
				} catch (ContactNotFoundException e) {
					System.out.println(e.getMessage());
				}
				
				break;

			case SEARCH_CONTACT:

				System.out.print("Enter name to be searched: ");
				String searchContact = scan.next();
				try {
					am = c.searchContactByName(searchContact);
					printContactInfo(am);
					
				} catch (ContactNotFoundException e) {
					System.out.println(e.getMessage());
				}
				
				break;

			case DELETE_CONTACT:

				System.out.print("Enter name to be deleted: ");
				String deleteContact = scan.next();
				try {
					c.deleteContactByName(deleteContact);
					System.out.println("Contact Deleted");
				} catch (ContactNotFoundException e) {
					System.out.println(e.getMessage());
				}

				
				break;

			case DISPLAY_CONTACT:
				try {
					am = ContactManager.displayContactList();
					printContactInfo(am);

					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			case EXIT:
				exit = true;

				break;

			default:
				System.out.println("Enter valid choice");
			}

			if (!exit) {
				System.out.println("Enter your choice");
				System.out.println("1. Add Contact." + "\n2. Modify Contact." + "\n3. Search Contact."
						+ "\n4. Delete Contact." + "\n5. Display Contact." + "\n6. Exit.");

				choice = scan.nextInt();
			}

		} while (!exit);

		System.out.println("Exiting.....");
	}

	public static ContactManager addContact(ArrayList<ContactManager> am) {
		System.out.print("Enter first name: ");
		String firstName = scan.next();

		System.out.print("Enter last name: ");
		String lastName = scan.next();

		System.out.print("Enter phone no: ");
		Long phoneNo = scan.nextLong();

		System.out.print("Enter email id: ");
		String emailID = scan.next();

		ContactManager c = new ContactManager(firstName, lastName, phoneNo, emailID);
		am.add(c);
		
		return c;
	}

	public static void printContactInfo(ArrayList<ContactManager> am) {

		if (am.isEmpty()) {
			System.out.println("No Contacts Found");
		} else {
			for (ContactManager contact : am) {
				System.out.println("First name: " + contact.getFirstName());
				System.out.println("Last name: " + contact.getLastName());
				System.out.println("Phone no: " + contact.getPhoneNo());
				System.out.println("Email id: " + contact.getEmailID());
				System.out.println();
			}
		}
	}

}
