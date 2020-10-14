package com.samara;

public abstract class Player {
	// properties
	private String name;

	// constructors
	public Player(String name) {
		this.name = name;
	}

	// getters
	public String getName() {
		return name;
	}
}
