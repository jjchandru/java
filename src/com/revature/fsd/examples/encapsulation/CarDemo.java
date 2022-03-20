package com.revature.fsd.examples.encapsulation;

public class CarDemo {
	public static void main(String args[]) {
		Car car = new Car("Honda", "Amaze", 2021);
		
		System.out.println(car.getDisplayText());
	}
}
