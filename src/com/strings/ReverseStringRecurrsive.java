package com.strings;

public class ReverseStringRecurrsive {

	String reverse = "";

	public String reverseString(String str) {
		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1)
					+ reverseString(str.substring(0, str.length() - 1));
			return reverse;
		}
	}

	public static void main(String a[]) {
		ReverseStringRecurrsive srr = new ReverseStringRecurrsive();
		System.out.println("Result: " + srr.reverseString("Java Oracle"));
	}

}
