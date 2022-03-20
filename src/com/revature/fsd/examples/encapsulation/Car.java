package com.revature.fsd.examples.encapsulation;

public class Car {
	private String manufacturer;
	private String model;
	private int year;
	private String displayText;
	
	public Car(String manufacturer, String model, int year) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.year = year;
		this.displayText = manufacturer + " " + model + " [" + year + "]";
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDisplayText() {
		return displayText;
	}
}
