package com.revature.fsd.examples;

public class MutableStringDemo {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("some text");
		buffer.insert(4, " [inserted text]");
		System.out.println(buffer);

		StringBuilder builder = new StringBuilder();
		builder.append("some text");
		builder.insert(4, " [inserted text]");
		System.out.println(builder);
	}

}
