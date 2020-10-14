package com.samara;

public class Case {
	// properties
	private String model;
	private String manufacturer;
	private String powerSupply;
	private com.samara.Dimensions dimensions;

	// constructors
	public Case(String model, String manufacturer, String powerSupply, com.samara.Dimensions dimensions) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.powerSupply = powerSupply;
		this.dimensions = dimensions;
	}

	// getters
	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public com.samara.Dimensions getDimensions() {
		return dimensions;
	}

	// methods
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}
}
