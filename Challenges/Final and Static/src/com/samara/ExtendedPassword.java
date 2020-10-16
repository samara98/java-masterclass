package com.samara;

public class ExtendedPassword extends Password {
// properties
	public int decryptedPassword;

// constructors

	public ExtendedPassword(int password) {
		super(password);
		this.decryptedPassword = password;
	}

//	@Override
//	public void storePassword() {
//		System.out.println("Saving password as " + this.decryptedPassword);
//	}
}
