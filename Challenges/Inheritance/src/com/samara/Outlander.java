package com.samara;

public class Outlander extends Car {
	// properties
	private int roadServiceMonths;

	public Outlander(int roadServiceMonths) {
		super("Outlander", "4WD", 5, 5, 6, false);
		this.roadServiceMonths = roadServiceMonths;
	}

	public void accelerate(int rate) {
		int newVelocity = this.getCurrentVelocity() + rate;
		if (newVelocity == 0) {
			this.stop();
			this.changeGear(1);
		} else if (newVelocity > 0 && newVelocity <= 10) {
			this.changeGear(1);
		} else if (newVelocity > 10 && newVelocity <= 20) {
			this.changeGear(2);
		} else if (newVelocity > 30 && newVelocity <= 30) {
			this.changeGear(3);
		} else {
			this.changeGear(4);
		}

		if (newVelocity > 0) {
			this.changeVelocity(newVelocity, this.getCurrentDirection());
		}
	}
}
