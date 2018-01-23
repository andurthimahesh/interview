package com.interview.programs;

public class SumOfEachDigit {
	int sum = 0;

	public int sumofnumber(int number) {

		if (number == 0) {
			return sum;
		} else {
			sum += (number % 10);
			sumofnumber(number / 10);
		}
		return sum;
	}

	public static void main(String a[]) {
		SumOfEachDigit sum = new SumOfEachDigit();

		int number = 456;
		sum.sumofnumber(number);

	}

}
