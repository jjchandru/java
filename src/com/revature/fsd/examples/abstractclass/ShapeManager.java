package com.revature.fsd.examples.abstractclass;

public class ShapeManager {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(2, 3);
		Rectangle rectangle2 = new Rectangle(3, 4);
		Rectangle rectangle3 = new Rectangle(5, 7);
		Square square1 = new Square(3);
		Square square2 = new Square(4);
		
		Shape[] shapes = { rectangle1, rectangle2, rectangle3, square1, square2 };
		for (Shape shape : shapes) {
			shape.calculateArea();
			shape.displayArea();
		}

	}

}
