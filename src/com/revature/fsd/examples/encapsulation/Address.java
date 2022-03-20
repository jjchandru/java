package com.revature.fsd.examples.encapsulation;

public class Address {
	private String doorNumber;
	private String street;
	private String town;
	private String areaCode;
	private String fullAddress;

	public Address(String doorNumber, String street, String town, String areaCode) {
		this.doorNumber = doorNumber;
		this.street = street;
		this.town = town;
		this.areaCode = areaCode;
	}
	
	public String getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getFullAddress() {
		fullAddress = "";
		fullAddress += doorNumber + " " + street + ",\n";
		fullAddress += town + " - " + areaCode + ".";
		return fullAddress;
	}

	public static void main(String args[]) {
		Address address = new Address("10", "Main Street", "Chennai", "600012");
		System.out.println(address.getFullAddress());
	}
}
