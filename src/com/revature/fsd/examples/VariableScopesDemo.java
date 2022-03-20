package com.revature.fsd.examples;

public class VariableScopesDemo {
	// instance scope;
	private int age;
	
	// class scope
	private static int number;
	
	public static void method() {
		String name = "John"; // visible till completion of method
		if (true) {
			float salary = 5708.0f; // visible within if block
		}
		// variable salary not visible here
		{
			float allowance = 234; // visible only within this code block
		}
		// variable allowance not visible here
	}
	
	public static void anotherMethod() {
		// 'name' variable not visible here.
	}

}
