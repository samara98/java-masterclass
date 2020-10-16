package com.samara;

public class SomeClass {
	// properties
	private static int classCounter = 0;
	public final int instanceNumber;
	private final String name;

	// constructors
	public SomeClass(String name) {
		this.name = name;
		classCounter++;
		instanceNumber = classCounter;
		System.out.println(name + " created, instance is " + instanceNumber);
	}

	// methods
	public int getInstanceNumber() {
		return instanceNumber;
	}
}
