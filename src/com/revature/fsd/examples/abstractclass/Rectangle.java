package com.revature.fsd.examples.abstractclass;

public class Rectangle extends Shape {
	private float length;
	private float width;
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public void calculateArea() {
		area = length * width;
	}
	
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(5, 10);
		rectangle.calculateArea();
		rectangle.displayArea();
	}
}
