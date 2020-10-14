package com.samara;

public class Lamp {
	// properties
	private String style;
	private boolean battery;
	private int globRating;

	// constructors
	public Lamp(String style, boolean battery, int globRating) {
		this.style = style;
		this.battery = battery;
		this.globRating = globRating;
	}

	// getters
	public String getStyle() {
		return style;
	}

	public int getGlobRating() {
		return globRating;
	}

	// methods
	public void turnOn() {
		System.out.println("Lamp -> Turning on");
	}

	public boolean isBattery() {
		return battery;
	}
}
