package com.samara;

import java.util.ArrayList;

public class Customer {
	// properties
	private String name;
	private ArrayList<Double> transactions;

	// constructors
	public Customer(String name, double initialAmount) {
		this.name = name;
		this.transactions = new ArrayList<Double>();
		this.addTransaction(initialAmount);
	}

	// getters
	public String getName() {
		return name;
	}

	public ArrayList<Double> getTransactions() {
		return transactions;
	}

	// methods
	public void addTransaction(double amount) {
		this.transactions.add(amount);
	}
}
