package com.revature.fsd.examples.variables;

public class Discount {
    public static void main(String args[]) {
        float total = 1250.25f;
        float discountPercent = 10.0f;
        float discount = total * (discountPercent / 100);
        System.out.println(discount);
    }
}
