package com.interview.programs;

public class FindingDuplicates {

	public void duplicates(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					System.out.println("Duplicate numbers : " + array[j]);
				}
			}

		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 6, 9, 3, 5, 4, 6, 9 };
		FindingDuplicates duplicates = new FindingDuplicates();
		duplicates.duplicates(array);

	}

}
