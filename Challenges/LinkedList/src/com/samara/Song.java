package com.samara;

public class Song {
	// properties
	private String title;
	private double duration;

	// constructors
	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}

	// getters
	public String getTitle() {
		return title;
	}

	// overriding
	@Override
	public String toString() {
		return this.title + ": " + this.duration;
	}
}
