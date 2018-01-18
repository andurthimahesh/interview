package com.interview.programs;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		/*
		 * int c; c = a;// c=10 a = b;// a=20 b = c;
		 */
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println(a + " " + b);

	}

}
