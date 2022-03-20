package com.revature.fsd.examples.fullabstraction;

public class Rectangle implements Shape {
	private float length;
	private float width;
	private float area;
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public void calculateArea() {
		area = length * width;
	}
	
	public void displayArea() {
		System.out.println("Area is: " + area);
	}
	
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(5, 10);
		rectangle.calculateArea();
		rectangle.displayArea();
	}
	
}
