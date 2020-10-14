package com.samara;

public class Printer {
	// properties
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;

	// constructors
	public Printer(int tonerLevel, boolean duplex) {
		if (tonerLevel > -1 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		} else {
			this.tonerLevel = -1;
		}
		this.duplex = duplex;
		this.pagesPrinted = 0;
	}

	// getters
	public int getPagesPrinted() {
		return pagesPrinted;
	}

	// methods
	public int addToner(int tonerAmount) {
		if (tonerAmount > 0 && tonerAmount <= 100) {
			if (this.tonerLevel + tonerAmount > 100) {
				return -1;
			}
			this.tonerLevel += tonerLevel;
			return this.tonerLevel;
		} else {
			return -1;
		}
	}

	public int printPages(int pages) {
		int pagesToPrint = pages;
		if (this.duplex) {
			pagesToPrint = (pages / 2) + (pages % 2);
			System.out.println("Printing on duplex mode");
		}
		this.pagesPrinted += pagesToPrint;
		return pagesToPrint;
	}
}
