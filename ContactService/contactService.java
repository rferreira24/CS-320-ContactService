package contact;

import java.util.HashMap;
import java.util.Map;

public class contactService {
	
	private Map<String, Contact> contactList = new HashMap<>();
	
	//adds a new contact with unique contact ID
	public void addContact(Contact contact) {
		if (contact == null) {
			throw new IllegalArgumentException("Warning: Contact cannot be null!");
		}
		
		String contactID = contact.getContactID();
		
		if (contactList.containsKey(contactID)) {
			throw new IllegalArgumentException("Warning: Contact already exists!");
			
		}
		
		contactList.put(contactID, contact);
	}
	
	// Deletes a contact by contact ID 
	public void deleteContact(String contactID) {
		if (contactID == null || !contactList.containsKey(contactID) ) {
			throw new IllegalArgumentException("Warning: Contact ID does not exist!");
		}
		
		contactList.remove(contactID);
	}
	
	// Updates contact field by contact ID 
	public void updateContact(
			String contactID, 
			String firstName,
			String lastName,
			String phoneNumber,
			String address) {
		
		if (contactID == null || !contactList.containsKey(contactID)) {
			throw new IllegalArgumentException("Warning: Contact ID does not exist!");
		}
		
		Contact contact = contactList.get(contactID);
		
		// Updates fields if new value is provided 
		if(firstName != null) {
			contact.setFirstName(firstName);
		}
		
		if (lastName != null) {
			contact.setLastName(lastName);
		}
		
		if (phoneNumber != null) {
			contact.setPhoneNumber(phoneNumber);
		}
		
		if (address != null) {
			contact.setAddress(address);
		}
	}
	
	// Added helper method for testing
	public Contact getContact(String contactID) {
		return contactList.get(contactID);
	}	
}
