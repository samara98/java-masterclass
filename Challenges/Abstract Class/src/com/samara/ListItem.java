package com.samara;

public abstract class ListItem {
	// properties
	protected ListItem rightLink = null;
	protected ListItem leftLink = null;

	protected Object value;

	// constructors
	public ListItem(Object value) {
		this.value = value;
	}

	// abstracts
	abstract ListItem next();

	abstract ListItem setNext(ListItem item);

	abstract ListItem previous();

	abstract ListItem setPrevious(ListItem item);

	abstract int compareTo(ListItem item);

	// getters & setters
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
