package com.samara;

public class PC {
	// properties
	private com.samara.Case theCase;
	private com.samara.Monitor monitor;
	private com.samara.Motherboard motherboard;

	// constructors
	public PC(com.samara.Case theCase, com.samara.Monitor monitor, com.samara.Motherboard motherboard) {
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	// methods
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}

	private void drawLogo() {
		// Fancy graphics
		monitor.drawPixelAt(1200, 50, "yellow");
	}
}
