package com.numbers;;

public class Fibo {

	public static void main(String args[]) {
		int a = 0, b = 0, c = 1;
		int n = 0;
		while (n < 10) {
			if (n == 0) {
				System.out.println(a);
			}
			if (n == 1) {
				System.out.println(c);
			}
			a = b;
			b = c;
			c = a + b;
			System.out.println(c);
			n++;
		}
	}
}
