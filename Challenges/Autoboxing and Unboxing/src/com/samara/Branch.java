package com.samara;

import java.util.ArrayList;

public class Branch {
	// properties
	private String name;
	private ArrayList<Customer> customers;

	// constructors
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<Customer>();
	}

	// getters
	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	// methods
	public boolean newCustomer(String customerName, double initialAmount) {
		if (this.findCustomer(customerName) == null) {
			this.customers.add(new Customer(customerName, initialAmount));
			return true;
		}
		return false;
	}

	public boolean addCustomerTransaction(String customerName, double amount) {
		Customer existingCustomer = this.findCustomer(customerName);
		if (existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		}
		return false;
	}

	private Customer findCustomer(String customerName) {
		for (int i = 0; i < this.customers.size(); i++) {
			Customer checkedCustomer = this.customers.get(i);
			if (checkedCustomer.getName().equals(customerName)) {
				return checkedCustomer;
			}
		}
		return null;
	}

}
