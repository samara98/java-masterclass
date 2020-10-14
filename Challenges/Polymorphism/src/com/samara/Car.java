package com.samara;

public class Car {
	// properties
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;

	// constructors
	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	// getters
	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

	// methods
	public String startEngine() {
		return "Car -> startEngine()";
	}

	public String accelerate() {
		return "Car -> accelerate()";
	}

	public String brake() {
		return "Car -> brake()";
	}
}
