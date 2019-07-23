package com.datastructures.recursion;

import java.util.Scanner;

// Factorial using recursion
public class Factorial {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to find factorial ");
		int input = scan.nextInt();
		System.out.println("The factorial of " + input + " is "
				+ factorial(input));
	}

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

}
