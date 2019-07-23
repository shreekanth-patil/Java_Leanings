package com.jdk5;

/**
 * @author shreekanth
 * 
 *         The Autoboxing feature eliminates the need for conversion between
 *         primitive data types such as int, float etc. and their respective
 *         wrapper classes Integer, Float, etc.
 * 
 *         The implicit automatic conversion of primitive values into
 *         corresponding wrapper class objects is known as ‘Autoboxing’.
 * 
 */
public class Autoboxing {

	public static void main(String args[]) {
		int a = 50;
		Integer a2 = new Integer(a);// Boxing

		Integer a3 = 5;// Boxing

		System.out.println(a2 + " " + a3);
	}

}
