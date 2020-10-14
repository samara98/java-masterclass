package com.samara;

public class Mitsubishi extends Car {
	// constructors
	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
	}

	// overriding
	@Override
	public String startEngine() {
		return "Mitsubishi -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Mitsubishi -> accelerate()";
	}

	@Override
	public String brake() {
		return "Mitsubishi -> brake()";
	}
}
