package com.samara;

import java.util.Scanner;

public class X {
	// properties
	private int x;

	// constructors
	public X(Scanner x) {
		System.out.println("Please enter a number: ");
		this.x = x.nextInt();
	}

	// methods
	public void x() {
		for (int i = 1; i <= 12; i++) {
			System.out.println(x + " times " + this.x + " equals " + x * this.x);
		}
	}
}
