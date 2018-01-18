package com.interview.programs;

import java.util.ArrayList;

public class ArrayListTest {
	// contain add(), get(), remove(), size() methods. Use dynamic array logic
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("getting a value from arraylist throw index base : " + list.get(3));
		System.out.println("removing an element :" + list.remove(4));
		System.out.println("Arraylist Size : " + list.size());

	}

}
