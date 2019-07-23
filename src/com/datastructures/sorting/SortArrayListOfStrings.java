package com.datastructures.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author shreekanth
 * The Collections.sort(collection) is able to sort only when 'collection' 
 * implements Comparable interface.
 * Here, we are sorting ArrayList of String type, String class implements Comparable interface.
 */
public class SortArrayListOfStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		
		List<String> fruits2 = new ArrayList<String>();
		
		fruits2.add("Apple");
		fruits2.add("Pineapple");
		fruits2.add("Jackfruits");


		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Banana");

		Collections.sort(fruits);
		
		int i = 0;
		for (String temp : fruits) {
			System.out.println("sorted fruits first list : " + ++i + " : " + temp);
		}
		System.out.println("------------------");
		Collections.sort(fruits2);
		
		int k = 0;
		for (String temp : fruits2) {
			System.out.println("sorted fruits second list : " + ++k + " : " + temp);
		}
		System.out.println("------------------");
		fruits.retainAll(fruits2);
				
		int j = 0;
		for (String temp : fruits) {
			System.out.println("common fruits in both the lists : " + temp);
		}
		
		
	}

}
