package com.samara;

public class Contact {
	// properties
	private String name;
	private String phoneNumber;

	// constructors
	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	// getters
	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	// methods
	public static Contact createContact(String name, String phoneNumber) {
		return new Contact(name, phoneNumber);
	}
}
