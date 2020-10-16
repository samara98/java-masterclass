package com.samara;

public class SIBTest {
	// properties
	public static final String owner;

	static {
		owner = "tim";
		System.out.println("SIBTest static initialization block called");
	}

	// constructors
	public SIBTest() {
		System.out.println("SIB constructor called");
	}

	static {
		System.out.println("2nd initialization block called");
	}

	public void someMethod() {
		System.out.println("someMethod called");
	}
}
