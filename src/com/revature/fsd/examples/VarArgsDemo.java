package com.revature.fsd.examples;

public class VarArgsDemo {
	
	public static int add(int ... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static void main(String args[]) {
		int sum = VarArgsDemo.add(2, 3, 7, 9, 1);
		System.out.println(sum);
	}

}
