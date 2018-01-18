package com.interview.programs;

public class PrimeNumber {
	public boolean isPrime = true;

	public void numberCheck(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;

			}
		}
		if (isPrime) {
			System.out.println("is a Prime Number : " + number);
		} else {
			System.out.println("is a not Prime Number : " + number);
		}

	}

	public static void main(String[] args) {
		PrimeNumber pn = new PrimeNumber();
		pn.numberCheck(7);
		pn.numberCheck(19);
		pn.numberCheck(15);

	}

}
