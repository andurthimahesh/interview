package com.interview.programs;

public class SingletonTest {
	private static SingletonTest stest;
	static {
		stest = new SingletonTest();
	}

	private SingletonTest() {

	}

	public static SingletonTest getInstance() {
		return stest;
	}

	public void test() {
		System.out.println("Singleton test");
	}

	public static void main(String[] args) {
		SingletonTest s = getInstance();
		s.test();
	}
}
