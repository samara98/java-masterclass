package com.poolarea;

public class Cuboid extends Rectangle {
	public Cuboid(double width, double length, double height) {
		super(width, length);
		if (height < 0) {
			this.height = 0;
		}
		else {
			this.height = height;
		}
	}

	// variables
	private double height;

	// methods
	public double getHeight() {
		return this.height;
	}

	public double getVolume() {
		return super.getArea() * this.height;
	}
}
