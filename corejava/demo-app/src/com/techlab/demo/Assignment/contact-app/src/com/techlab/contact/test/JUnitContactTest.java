package com.techlab.contact.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.techlab.contact.Contact;
import com.techlab.contact.ContactManager;

class JUnitContactTest {

	@Test
	void testContactConstructor() {

		// Arrange
		String expectedFirstName = "sam";
		String expectedLastName = "thomas";
		long expectedPhoneNo = 988888;
		String expectedEmailID = "sam@gmail.com";

		// Act
		Contact c = new Contact("sam", "thomas", 988888, "sam@gmail.com");

		// Assert
		assertEquals(expectedFirstName, c.getFirstName());
		assertEquals(expectedLastName, c.getLastName());
		assertEquals(expectedPhoneNo, c.getPhoneNo());
		assertEquals(expectedEmailID, c.getEmailID());
	}

	@Test
	void testContactManagerConstructor() {

		// Arrange
		String expectedFirstName = "sam";
		String expectedLastName = "thomas";
		long expectedPhoneNo = 988888;
		String expectedEmailID = "sam@gmail.com";

		// Act
		ContactManager c = new ContactManager("sam", "thomas", 988888, "sam@gmail.com");

		// Assert
		assertEquals(expectedFirstName, c.getFirstName());
		assertEquals(expectedLastName, c.getLastName());
		assertEquals(expectedPhoneNo, c.getPhoneNo());
		assertEquals(expectedEmailID, c.getEmailID());
	}

	@Test
	void testAddToContact() throws Exception {

		// Arrange
		String expectedFirstName = "sam";
		String expectedLastName = "thomas";
		long expectedPhoneNo = 988888;
		String expectedEmailID = "sam@gmail.com";

		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> list = new ArrayList<ContactManager>();
		list.add(new ContactManager("sam", "thomas", 988888, "sam@gmail.com"));
		contact.addToContacts(list);
		
		ArrayList<ContactManager> resultList = ContactManager.displayContactList();

		// Assert
		for (int i = 0; i < resultList.size(); i++) {
			assertEquals(expectedFirstName, resultList.get(i).getFirstName());
			assertEquals(expectedLastName, resultList.get(i).getLastName());
			assertEquals(expectedPhoneNo, resultList.get(i).getPhoneNo());
			assertEquals(expectedEmailID, resultList.get(i).getEmailID());

		}
	}

	@Test
	void testModifyContact() throws Exception {

		// Arrange
		String expectedFirstName = "sam";
		String expectedLastName = "thomas";
		long expectedPhoneNo = 988888;
		String expectedEmailID = "sam@gmail.com";

		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> list = new ArrayList<ContactManager>();
		list.add(new ContactManager("tom", "thomas", 988888, "sam@gmail.com"));

		contact.addToContacts(list);
		contact.modifyContactByName("tom", "sam");	
		ArrayList<ContactManager> resultList = ContactManager.displayContactList();
			
		// Assert
		for (int i = 0; i < resultList.size(); i++) {
			assertEquals(expectedFirstName, resultList.get(i).getFirstName());
			assertEquals(expectedLastName, resultList.get(i).getLastName());
			assertEquals(expectedPhoneNo, resultList.get(i).getPhoneNo());
			assertEquals(expectedEmailID, resultList.get(i).getEmailID());
		}
	}

	@Test
	void testDeleteContact() throws Exception {

		// Arrange
		String expectedFirstName = "sam";
		String expectedLastName = "thomas";
		long expectedPhoneNo = 988888;
		String expectedEmailID = "sam@gmail.com";

		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> list = new ArrayList<ContactManager>();
		list.add(new ContactManager("sam", "thomas", 988888, "sam@gmail.com"));
		list.add(new ContactManager("tom", "thomas", 983188, "tom@gmail.com"));

		contact.addToContacts(list);
		contact.deleteContactByName("tom");	
		ArrayList<ContactManager> resultList = ContactManager.displayContactList();

		// Assert
		for (int i = 0; i < resultList.size(); i++) {
			assertEquals(expectedFirstName, resultList.get(i).getFirstName());
			assertEquals(expectedLastName, resultList.get(i).getLastName());
			assertEquals(expectedPhoneNo, resultList.get(i).getPhoneNo());
			assertEquals(expectedEmailID, resultList.get(i).getEmailID());
		}
	}
	
	@Test
	void testSearchContact() throws Exception {
		
		// Arrange
		String expectedFirstName = "sam";
		String expectedLastName = "thomas";
		long expectedPhoneNo = 988888;
		String expectedEmailID = "sam@gmail.com";
		
		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> list = new ArrayList<ContactManager>();
		list.add(new ContactManager("sam", "thomas", 988888, "sam@gmail.com"));
		list.add(new ContactManager("tom", "thomas", 983188, "tom@gmail.com"));
		
		contact.addToContacts(list);
		ArrayList<ContactManager> resultList = contact.searchContactByName("sam");
		
		// Assert
		for (int i = 0; i < resultList.size(); i++) {
			assertEquals(expectedFirstName, resultList.get(i).getFirstName());
			assertEquals(expectedLastName, resultList.get(i).getLastName());
			assertEquals(expectedPhoneNo, resultList.get(i).getPhoneNo());
			assertEquals(expectedEmailID, resultList.get(i).getEmailID());
		}		
	}
}
