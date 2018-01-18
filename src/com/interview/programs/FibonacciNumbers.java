package com.interview.programs;

public class FibonacciNumbers {
	public void print() {
		int number1 = 0, number2 = 1, number3, i, size = 11;
		System.out.print(number1 + " " + number2);
		for (i = 2; i < size; i++) {
			number3 = number1 + number2;
			System.out.print(" " + number3);
			number1 = number2;
			number2 = number3;
		}
	}

	public static void main(String[] args) {
		FibonacciNumbers numbers = new FibonacciNumbers();
		numbers.print();

	}

}
