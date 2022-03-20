package com.revature.fsd.examples;

public class StringDemo {
	public static void main(String args[]) {
		String firstName = "John";
		String lastName = "Smith";
		String fullName = lastName + ", " + firstName;
		System.out.println(fullName);
		System.out.println(fullName.charAt(2));
		System.out.println(firstName.equals(lastName));
	}
}