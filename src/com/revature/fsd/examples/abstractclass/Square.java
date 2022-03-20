package com.revature.fsd.examples.abstractclass;

public class Square extends Shape {
	private float side;
	
	public Square(float side) {
		this.side = side;
	}
	
	public void calculateArea() {
		area = side * side;
	}

}
