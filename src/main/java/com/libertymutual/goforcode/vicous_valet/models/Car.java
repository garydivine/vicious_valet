package com.libertymutual.goforcode.vicous_valet.models;

public class Car {

	private String license;
	private String state;
	private String color;
	private String make;
	private String model;

	public Car(String license, String state, String color, String make, String model) {
		this.license = license; // keyword this refers to the class
		this.state = state;
		this.color = color;
		this.make = make;
		this.model = model;
	}

	public String getLicense() {
		return license;
	}

	public String getState() {
		return state;
	}

	public String getColor() {
		return color;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

}
