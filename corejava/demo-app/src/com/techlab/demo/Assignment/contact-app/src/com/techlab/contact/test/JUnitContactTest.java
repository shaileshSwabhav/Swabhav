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
		ArrayList<ContactManager> expectedList = new ArrayList<ContactManager>();
		expectedList.add(new ContactManager("sam", "thomas", 988888, "sam@gmail.com"));
	
		// Act
		ContactManager contact = new ContactManager();
		contact.addToContacts(expectedList);
		ArrayList<ContactManager> resultList = contact.displayContactList();

		// Assert
		assertEquals(expectedList.size(), resultList.size());
		for(int i = 0; i < expectedList.size(); i++) {
			assertEquals(expectedList.get(i).getFirstName(), resultList.get(i).getFirstName());
			assertEquals(expectedList.get(i).getLastName(), resultList.get(i).getLastName());
			assertEquals(expectedList.get(i).getPhoneNo(), resultList.get(i).getPhoneNo());
			assertEquals(expectedList.get(i).getEmailID(), resultList.get(i).getEmailID());

		}

	}

	@Test
	void testModifyContact() throws Exception {

		// Arrange
		ArrayList<ContactManager> expectedList = new ArrayList<ContactManager>();
		expectedList.add(new ContactManager("tom", "thomas", 988888, "sam@gmail.com"));
		
		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> c = new ArrayList<ContactManager>();
		c.add(new ContactManager("sam", "thomas", 988888, "sam@gmail.com"));
		
		contact.addToContacts(c);
		contact.modifyContactByName("sam", "tom");
		ArrayList<ContactManager> resultList = contact.displayContactList();
		
		// Assert
		assertEquals(expectedList.size(), resultList.size());
		for(int i = 0; i < expectedList.size(); i++) {
			assertEquals(expectedList.get(i).getFirstName(), resultList.get(i).getFirstName());
			assertEquals(expectedList.get(i).getLastName(), resultList.get(i).getLastName());
			assertEquals(expectedList.get(i).getPhoneNo(), resultList.get(i).getPhoneNo());
			assertEquals(expectedList.get(i).getEmailID(), resultList.get(i).getEmailID());

		}
		
	}

	@Test
	void testDeleteContact() throws Exception {

		// Arrange
		ArrayList<ContactManager> expectedList = new ArrayList<ContactManager>();
		expectedList.add(new ContactManager("tom", "thomas", 988888, "sam@gmail.com"));
		
		// Act
		ContactManager contact = new ContactManager();
		ArrayList<ContactManager> c = new ArrayList<ContactManager>();
		c.add(new ContactManager("sam", "thomas", 988888, "sam@gmail.com"));
		c.add(new ContactManager("tom", "thomas", 988888, "sam@gmail.com"));
		
		contact.addToContacts(c);
		contact.deleteContactByName("sam");
		ArrayList<ContactManager> resultList = contact.displayContactList();
		
		// Assert
		assertEquals(expectedList.size(), resultList.size());
		for(int i = 0; i < expectedList.size(); i++) {
			assertEquals(expectedList.get(i).getFirstName(), resultList.get(i).getFirstName());
			assertEquals(expectedList.get(i).getLastName(), resultList.get(i).getLastName());
			assertEquals(expectedList.get(i).getPhoneNo(), resultList.get(i).getPhoneNo());
			assertEquals(expectedList.get(i).getEmailID(), resultList.get(i).getEmailID());

		}
		
	}

}
