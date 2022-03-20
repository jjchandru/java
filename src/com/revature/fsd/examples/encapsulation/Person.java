package com.revature.fsd.examples.encapsulation;

public class Person {
	private String name;
	private Address address;
	private String mailingAddress;
	
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getMailingAddress() {
		mailingAddress = name + ",\n" + address.getFullAddress();
		return mailingAddress;
	}

	public static void main(String args[]) {
		Address address = new Address("10", "Main Street", "Chennai", "600012");
		Person person = new Person("John", address);
		System.out.println(person.getMailingAddress());
	}
}
