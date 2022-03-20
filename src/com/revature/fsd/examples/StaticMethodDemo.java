package com.revature.fsd.examples;

public class StaticMethodDemo {
	
	public static void staticMethod() {
		System.out.println("staticMethod() called.");
	}

	public static void main(String[] args) {
		staticMethod(); // within same class no class prefix required
		StaticMethodDemo.staticMethod(); // class required when calling from another class
	}

}
