package com.revature.fsd.exercises;

import java.util.Scanner;

public class MultiplicationTablePrinter {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Table for which number:");
		int number = scanner.nextInt();
		
		// Print the multiplication table for number
		// Output:
		// Multiplication Table for 5
		// 5 x 1 = 5
		// 5 x 2 = 10
		// 5 x 3 = 15
		// ..
		// 5 x 10 = 50
		
		scanner.close();
	}
}
