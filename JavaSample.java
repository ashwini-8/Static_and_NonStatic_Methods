package com.java.sample;

public class JavaSample {
	// This is a static method
	static void method1() {
		System.out.println("Method 1");
	}

	void method2() {
		System.out.println("Method 2");

	}

	public static void main(String[] args) {
		method1();
		JavaSample J = new JavaSample();
		J.method2();

	}
}
