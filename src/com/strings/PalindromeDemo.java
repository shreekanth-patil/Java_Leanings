package com.strings;

public class PalindromeDemo {

	public static void main(String[] args) {

		String str = "MADAM";
		String revstring = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revstring += str.charAt(i);
		}

		System.out.println(revstring);

		if (revstring.equalsIgnoreCase(str)) {
			System.out.println("The string is Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}