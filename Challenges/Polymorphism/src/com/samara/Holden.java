package com.samara;

public class Holden extends Car {
	// constructors
	public Holden(int cylinders, String name) {
		super(cylinders, name);
	}

	// overriding
	@Override
	public String startEngine() {
		return getClass().getSimpleName() + " -> startEngine()";
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() + " -> accelerate()";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() + " -> brake()";
	}
}
