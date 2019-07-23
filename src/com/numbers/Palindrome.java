package com.numbers;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {

		System.out.println("Please Enter a number : ");
		int givennumber = new Scanner(System.in).nextInt();
		int number = givennumber;
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("reversed number " + reverse);
		if (givennumber == reverse)
			System.out.println("Result:Palindrome");
		else
			System.out.println("Result:Not Palindrome");
	}

}
