package com.interview.programs;

public class ReverseANumber {

	public int reverse(int number) {
		int reverseNumber = 0;
		while (number != 0) {
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + number % 10;
			number = number / 10;
		}
		return reverseNumber;

	}

	public static void main(String[] args) {
		ReverseANumber number = new ReverseANumber();
		System.out.println(number.reverse(678));

	}

}
