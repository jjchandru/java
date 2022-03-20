package com.revature.fsd.examples;

import java.util.Scanner;
public class ScannerDemo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        System.out.println(age);
    }
}
