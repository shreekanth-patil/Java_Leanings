package com.strings;

import java.util.Scanner;

public class CountNumberofVowels {

	public static void main(String[] args) {

		System.out.println("Please enter a String");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		char[] Chararray = input.toCharArray();

		int count = 0;

		for (char ch : Chararray) {
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				count++;
				break;
			default:

			}
		}
		System.out.println("Number of vowels in String " + count);

	}
}
