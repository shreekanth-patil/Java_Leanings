package com.datastructures.recursion;

import java.util.Scanner;
// It solves below series
// 1, 3, 6, 10, 15, 21
// Adds pre numbers to find next
// 1, 2, 3, 4, 5, 6
public class TriangleApp {

	static int theNumber;

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		try(Scanner scan = new Scanner(System.in)){
		theNumber = scan.nextInt();
		int theAnswer = triangle(theNumber);
		System.out.println("Triangle=" + theAnswer);
		} catch(Exception io){
			
		}
		
	} // end main()

	/**
	 * @param n recursive method
	 * @return
	 */
	public static int triangle(int n) {
		if (n == 1)
			return 1;
		else
			return (n + triangle(n - 1));
	}
}