package com.interview.programs;

public class CommonElements {
	public void commonElements(int[] array, int[] array2) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array2.length; j++) {

				if (array[i] == array2[j]) {
					System.out.print(array[i]+" ");
				}
			}

		}

	}

	public static void main(String[] args) {
		int[] array = { 2, 3, 6, 7, 9, 11 };
		int[] array2 = { 5, 2, 6, 7, 2, 11 };
		CommonElements cm = new CommonElements();
		cm.commonElements(array, array2);

	}

}
