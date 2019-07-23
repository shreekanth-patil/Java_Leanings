package com.jdk5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shreekanth
 * 
 *  Enhanced for loop is also referred as ‘forEach’ Loop and is
 *         specifically designed to iterate through arrays and collections.
 *         Here, we can simply iterate through the list ‘names’ and retrieve
 *         each element into variable ‘name’. 
 *         
 *         After that, we can do whatever we
 *         want with that variable as usual. Enhanced for loop avoids the need
 *         for using temporary index variable and simplifies the process of
 *         iterating over arrays and collections.
 * 
 */
public class foreachloop {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Peter");
		names.add("Khan");
		names.add("Singh");

		for (String name : names) {
			System.out.println(" Name = " + name);
		}
	}

}
