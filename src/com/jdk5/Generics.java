package com.jdk5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author shreekanth
 * 
 *         we can use Generics to provide compile-time type safety to
 *         collections
 * 
 */
public class Generics {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Ram");
		names.add("Peter");
		names.add("Khan");
		names.add("Singh");
		//names.add(new Date()); // Compiler error
		for (int i = 0; i < names.size(); i++) {
			// No need of type casting (String)
			String name = names.get(i);
			System.out.println(" Name = " + name);
		}
	}

}
