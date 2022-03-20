package com.revature.fsd.examples.function;

public class FunctionDemo3 {
	public static String getGreetings(String name) {
        return "Hello " + name;
    }
    
	public static void main(String args[]) {
        String greetings = getGreetings("John");
        System.out.println(greetings);
    }
}
