package com.complexoperations;

public class ComplexNumber {
	//	variables
	private double real;
	private double imaginary;

	// constructor
	public ComplexNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	// 	methods
	public double getReal() {
		return  this.real;
	}

	public double getImaginary() {
		return this.imaginary;
	}

	public void add(double real, double imaginary) {
		this.real += real;
		this.imaginary += imaginary;
	}

	public void add(ComplexNumber complexNumber) {
		this.real += complexNumber.getReal();
		this.imaginary += complexNumber.getImaginary();
	}

	public void subtract(double real, double imaginary) {
		this.real -= real;
		this.imaginary -= imaginary;
	}

	public void subtract(ComplexNumber complexNumber) {
		this.real -= complexNumber.getReal();
		this.imaginary -= complexNumber.getImaginary();
	}
}
