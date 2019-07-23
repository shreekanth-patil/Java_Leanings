package com.numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {
		System.out.println("Please enter number");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();

		System.out.println("Result is " + factorial(num));
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1)
			return n;
		else
			return factorial(n - 1) * n;
	}

}
