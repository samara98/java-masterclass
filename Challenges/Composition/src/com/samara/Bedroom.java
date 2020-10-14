package com.samara;

public class Bedroom {
	// properties
	private String name;
	private com.samara.Wall wall1;
	private com.samara.Wall wall2;
	private com.samara.Wall wall3;
	private com.samara.Wall wall4;
	private com.samara.Ceiling ceiling;
	private Bed bed;
	private com.samara.Lamp lamp;

	// constructors
	public Bedroom(String name, com.samara.Wall wall1, com.samara.Wall wall2, com.samara.Wall wall3, com.samara.Wall wall4, com.samara.Ceiling ceiling, Bed bed, com.samara.Lamp lamp) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.ceiling = ceiling;
		this.bed = bed;
		this.lamp = lamp;
	}

	// getters
	public com.samara.Lamp getLamp() {
		return this.lamp;
	}

	// methods
	public void makeBed() {
		System.out.println("Bedroom -> Making bed");
		bed.make();
	}
}
