package com.misc;
/*
 * Use string concatenation (+) with care
 * At least one operand must be a String
 */
public class Trivial {
	public static void main(String args[]) {
		System.out.print("H" + "a");
		System.out.print('H' + 'a');
		System.out.println();
		System.out.println(2.00 - 1.10); 
		//Decimal values can’t be represented exactly by float or double
		//Use BigDecimal, int, or long instead
	}
}