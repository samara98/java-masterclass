package com.cylinder;

public class Cylinder extends Circle {
	// variables
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		if (height < 0) {
			this.height = 0;
		}
		else {
			this.height = height;
		}
	}

	// methods
	public double getHeight() {
		return this.height;
	}

	public double getVolume() {
		return this.getArea() * this.height;
	}
}
