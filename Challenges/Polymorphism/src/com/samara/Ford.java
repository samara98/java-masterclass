package com.samara;

public class Ford extends Car {
	// constructors
	public Ford(int cylinders, String name) {
		super(cylinders, name);
	}

	// overriding
	@Override
	public String startEngine() {
		return "Ford -> startEngine()";
	}

	@Override
	public String accelerate() {
		return "Ford -> accelerate()";
	}

	@Override
	public String brake() {
		return "Ford -> brake()";
	}
}
