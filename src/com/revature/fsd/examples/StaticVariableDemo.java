package com.revature.fsd.examples;

public class StaticVariableDemo {
	private static int objectCount = 0;
	
	public StaticVariableDemo() {
		objectCount++;
	}
	
	public int getObjectCount() {
		return objectCount;
	}

	public static void main(String args[]) {
		StaticVariableDemo demo1 = new StaticVariableDemo();
		StaticVariableDemo demo2 = new StaticVariableDemo();
		StaticVariableDemo demo3 = new StaticVariableDemo();
		System.out.println(demo1.getObjectCount());
		System.out.println(demo2.getObjectCount());
		System.out.println(demo3.getObjectCount());

	}
}
