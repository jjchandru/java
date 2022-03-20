package com.revature.fsd.examples.polymorphism;

public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
		RuntimePolymorphismParent parent = new RuntimePolymorphismParent();
		parent.method(); // Parent method() called

		RuntimePolymorphismChild child = new RuntimePolymorphismChild();
		child.method(); // Child method() called

		RuntimePolymorphismParent parentChild = new RuntimePolymorphismChild();
		parentChild.method(); // Child method() called.

	}

}
