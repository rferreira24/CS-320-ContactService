package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testValidNewContact() {
		Contact contact = new Contact("2499", "Ryan", "Ferreira", "1234567890", "789 Apple Road");
	
		assertEquals("2499", contact.getContactID());
		assertEquals("Ryan", contact.getFirstName());
		assertEquals("Ferreira", contact.getLastName());
		assertEquals("1234567890", contact.getPhoneNumber());
		assertEquals("789 Apple Road", contact.getAddress());
	}
	
	//Contact ID tests
	//Tests if contact ID is too long
	@Test
	void testContactIDTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("12345678901", "Ryan", "Ferreira", "1234567890", "789 Apple Road");
		});
	}
	
	//Tests if contact ID is null 
	@Test
	void testContactIDNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Ryan", "Ferreira", "1234567890", "789 Apple Road");
		});
	}
	
	//First Name tests
	//Tests if first name is too long 
	@Test
	void testFirstNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("24", "Ryannnnnnnn", "Ferreira", "1234567890", "789 Apple Road");
		});
	}

	//Tests if first name is null 
	@Test
	void TestFirstNameNull() {
		assertThrows(IllegalArgumentException.class,() -> {
			new Contact("24", null, "Ferreira", "123456789", "789 Apple Road");
		});
	}
	
	//Last Name tests
	//Tests if last name is too long
	@Test
	void TestLastNameTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("24", "Ryan", "Ferreiraaaa", "1234567890", "789 Apple Road");
		});
	}
	
	//Tests if last name is null 
	@Test
	void TestLastNameNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("24", "Ryan", null, "1234567890", "789 Apple Road");
		});
	}
	
	//Phone number test
	//Test if phone number is too short
	@Test
	void TestPhoneNumberTooShort() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("24", "Ryan", "Ferreira", "123456", "789 Apple Road");
		});
	}
	
	//Test if phone number is too long
	@Test
	void TestPhoneNumberTooLong () {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("24", "Ryan", "Ferreira", "12345678901", "789 Apple Road");
		});
	}
	
	//Test if letters were entered in phone number 
	@Test
	void TestPhoneNumberWithLetters() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact ("24", "Ryan", "Ferreira", "abcd567890", "789 Apple Road");
		});
	}
	
	//Test if phone number is null 
	@Test
	void TestPhoneNumberNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("24", "Ryan", "Ferreira", null, "789 Apple Road");
		});
	}
	
	//Address Tests
	//Tests if address is too long
	@Test 
	void TestAddressTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("24", "Ryan", "Ferreira", "1234567890", "789 Apple Road Avenue Boulevard Street");
		});
	}
	//Test if address is null 
	@Test
	void TestAddressNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("24", "Ryan", "Ferreira", "1234567890", null);
		});
	}
}
	
	
	
	

		