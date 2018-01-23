package com.interview.programs;

public class TopTwoNumbers {
	public void duplicates(int[] array) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}

		}
		System.out.println(array[0] + "  " + array[1]);
	}

	public static void main(String[] args) {
		int[] array = { 23, 45, 2, 6, 7, 98, 56, 34, 67, 97 };
		TopTwoNumbers two = new TopTwoNumbers();
		two.duplicates(array);

	}

}
