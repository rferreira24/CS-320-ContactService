package contact;

public class Contact {
	
	private final String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
		
		
		//Validates Contact ID
		if (contactID == null || contactID.length() == 0 || contactID.length() > 10) {
			throw new IllegalArgumentException("Not a valid contact ID");
		}
		
		this.contactID = contactID;
		
		//Setters to validate first name, last name, phone number and address
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setAddress(address);
	}
	
	//Getters
	public String getContactID() { return contactID; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getPhoneNumber() { return phoneNumber; }
	public String getAddress() { return address; }
	
	// Sets and validates first name 
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First Name cannot be blank AND cannot reach more than 10 characters!");
		}
		this.firstName = firstName;
	
	}
	
	//Sets and validates last name 
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last Name cannot be blank AND cannot reach more than 10 characters!");
		}
		this.lastName = lastName;
	}
	
	//Sets and validates phone number 
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Phone number must be exactly 10 digits AND cannot be blank!");
		}
		this.phoneNumber = phoneNumber;
	}
	
	//Sets and validates address
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Address cannot be blank AND cannot reach more than 30 characters!");
		}
		this.address = address;
	}
	
}
	
	
	
