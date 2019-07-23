package com.jdk5;

/**
 * @author shreekanth
 * 
 *         The Varargs java 5.0 feature avoids the need to group up arguments
 *         into an array in order to pass while invoking a method.
 * 
 *      Varargs can also be combined with other arguments, but there should
 *         be only one vararg for a method and that vararg should be the last
 *         argument for that method.
 * 
 */
public class Varargs {

	public static void main(String[] args) {
		System.out.println(" Sum = " + sum(41, 22, 58));
	}

	static int sum(int... numbers) { // varargs
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

}
