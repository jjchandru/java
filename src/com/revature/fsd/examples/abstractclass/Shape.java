package com.revature.fsd.examples.abstractclass;

public abstract class Shape {
	protected float area;
	
	abstract void calculateArea();
	
	public void displayArea() {
		System.out.println("Area is " + area);
	}
}
