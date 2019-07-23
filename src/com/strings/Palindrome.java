package com.strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = in.nextLine();

		StringBuffer strone = new StringBuffer(str);
		StringBuffer strtwo = new StringBuffer(strone);

		strone.reverse();

		System.out.println("Orginal String =" + strtwo);
		System.out.println("After Reverse =" + strone);

		if (String.valueOf(strone).compareTo(String.valueOf(strtwo)) == 0)
			System.out.println("Result:Palindrome");
		else
			System.out.println("Result:Not Palindrome");

	}

}