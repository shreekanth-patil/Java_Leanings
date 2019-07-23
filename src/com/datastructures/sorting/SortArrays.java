package com.datastructures.sorting;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		String[] fruits = new String[] { "Pineapple", "Apple", "Orange", "Banana" };

		//parameter fruits holds String elements.. String implements Comparable so works..
		Arrays.sort(fruits);

		int i = 0;
		for (String temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp);
		}

	}

}
