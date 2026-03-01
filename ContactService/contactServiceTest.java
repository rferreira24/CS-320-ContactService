package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class contactServiceTest {
	
	//Add contact tests
	@Test 
	void testAddContact() {
		contactService service = new contactService();
		Contact contact = new Contact("24", "Ryan", "Ferreira", "1234567890", "789 Apple Road");
		
		service.addContact(contact);
		
		assertEquals(contact, service.getContact("24"));
	}
	//Test for adding existing contactID
	@Test
	void testAddExistingContactID() {
		contactService service = new contactService();
		Contact contact1 = new Contact("24", "Ryan", "Ferreira", "1234567890", "789 Apple Road");
		Contact contact2 = new Contact("24", "Bianca", "DiLernia", "2468101246", "456 Apple Road");
		
		service.addContact(contact1);
		
		assertThrows(IllegalArgumentException.class, () -> {
			service.addContact(contact2);
		});
	}
	
	//Delete contact tests
	@Test
	void testDeleteContact() {
		contactService service = new contactService();
		Contact contact = new Contact("24", "Ryan", "Ferreira", "1234567890", "789 Apple Road");
		
		service.addContact(contact);
		service.deleteContact("24");
		
		assertNull(service.getContact("24"));
	}
	//Tests for deleting non existing contact 
	@Test
	void testDeleteNonExistingContact() {
	    contactService service = new contactService();

	    assertThrows(IllegalArgumentException.class, () -> {
	        service.deleteContact("244");
	    });
	}
	
	//Update contact tests
	//Update first name tests
	@Test
	void testUpdateFirstName() {
		contactService service = new contactService();
		Contact contact = new Contact("24", "Ryan", "Ferreira", "1234567890", "789 Apple Road");
		
		service.addContact(contact);
		service.updateContact("24", "Bianca", null, null, null);
		
		assertEquals("Bianca", service.getContact("24").getFirstName());
	}
	
	//Test to update last name
	@Test
	void testUpdateLastName() {
		contactService service = new contactService();
		Contact contact = new Contact("24", "Ryan", "Ferreira", "1234567890", "789 Apple Road");
		
		service.addContact(contact);
		service.updateContact("24", null, "DiLernia", null, null);
		
		assertEquals("DiLernia", service.getContact("24").getLastName());
	}
	
	// Test to update phone number 
	@Test
	void testUpdatePhoneNumber() {
		contactService service = new contactService();
		Contact contact = new Contact ("24", "Ryan", "Ferreira", "1234567890", "789 Apple Road");
		
		service.addContact(contact);
		service.updateContact("24", null, null, "2468101246", null);
		
		assertEquals("2468101246", service.getContact("24").getPhoneNumber());
	}
	
	//Test to update address
	@Test
	void testUpdateAddress() {
		contactService service = new contactService();
		Contact contact = new Contact("24", "Ryan", "Ferreira", "1234567890", "789 Apple Road");
		
		service.addContact(contact);
		service.updateContact("24", null, null, null, "456 Apple Road");
		
		assertEquals("456 Apple Road", service.getContact("24").getAddress());
	}
	
	//Test to update non existing contact
	@Test
	 void testUpdateNonExistingContact() {
        contactService service = new contactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateContact("244", "Bianca", "DiLernia", "2468101246", "No Address");
        });
    }

}
