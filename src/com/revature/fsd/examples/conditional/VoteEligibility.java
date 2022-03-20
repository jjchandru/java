package com.revature.fsd.examples.conditional;

public class VoteEligibility {
    public static void main(String args[]) {
        int age = 10;
        if (age > 17) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}
