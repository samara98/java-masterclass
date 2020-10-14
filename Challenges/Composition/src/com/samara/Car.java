package com.samara;

public class Car extends Vehicle {
	// properties
	private int doors;
	private int engineCapacity;

	// constructors
	public Car(String name, int doors, int engineCapacity) {
		super(name);
		this.doors = doors;
		this.engineCapacity = engineCapacity;
	}
}
