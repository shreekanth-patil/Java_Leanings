package com.jdk5;

/**
 * @author shreekanth
 * 
 *    Java 5 provides an interpreter for C language printf-style format
 *         strings. This feature provides support for layout justification and
 *         alignment, common formats for numeric, string, and date/time data,
 *         and locale-specific output. 
 *    
 *    The String class has a method called
 *         ‘format’ which takes first argument as formatted string and the
 *         remaining arguments as values to be substituted for conversions (%d,
 *         %f, etc) inside the formatted string.
 * 
 * 
 */

public class Formatting {

	public static void main(String args[]) {

		int m1 = 78, m2 = 93, m3 = 85;
		int total = m1 + m2 + m3;
		double avg = total / 3.0;
		
		String result = String.format("Marks: %d, %d, %d. Total: %d, Avg: %.2f", 
				m1, m2, m3, total, avg);
		System.out.println(result);
	}

}
