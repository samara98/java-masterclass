package com.samara;

public class Password {
	// properties
	private static final int key = 748576362;
	private final int encryptedPassword;

	// constructors
	public Password(int password) {
		this.encryptedPassword = encryptDecrypt(password);
	}

	// methods
	public int encryptDecrypt(int password) {
		return password ^ key;
	}

	public final void storePassword() {
		System.out.println("Saving password as " + this.encryptedPassword);
	}

	public boolean letMeIn(int password) {
		if (encryptDecrypt(password) == this.encryptedPassword) {
			System.out.println("Welcome");
			return true;
		} else {
			System.out.println("Nope, you cannot come in");
			return false;
		}
	}
}
