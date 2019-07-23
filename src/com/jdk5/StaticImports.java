package com.jdk5;

import static java.lang.Integer.*;
import static java.lang.String.format;



/**
 * @author shreekanth
 * 
 *         This feature eliminates the process of qualifying the static members
 *         of a class with the class name. Those members can be methods as well
 *         as fields.
 * 
 * Important Note:
 *  
 * 		   Remember the order of keywords. It is ‘import static‘
 *         but not ‘static import’. (I know, it is little bit confused with
 *         feature title)
 * 
 * 
 */
public class StaticImports {

	public static void main(String[] args) {
		int num = parseInt("526"); // => Integer.parseInt()
		
		Integer num2 = valueOf("123"); // => Integer.valueOf()
		
		// => String.format()
		System.out.println(format("Numbers: %d, %d", num, num2));
		
		// => Integer.MAX_VALUE
		System.out.println(" Integer MAX value = " + MAX_VALUE);
	}

}
