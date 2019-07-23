package com.strings;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello world";
		String NEW_STRING = "This is new String";
		String revstring = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revstring += str.charAt(i);
		}
		System.out.println(str);
		System.out.println(revstring);

		System.out.println("Now with method :");
		System.out.println(NEW_STRING);
		System.out.print(reverseString(NEW_STRING));
	}

	public static char[] reverseString(String str) {
		char[] chars = str.toCharArray();
		int i = 0, j = chars.length - 1;
		while (i < j) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			i++;
			j--;
		}
		return chars;
	}
}