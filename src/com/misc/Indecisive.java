package com.misc;
/*
 * The finally is processed after the try.
 */
class Indecisive {
	public static void main(String[] args) {
		System.out.println(waffle());
	}

	static boolean waffle() {
		try {
			return true;
		} finally {
			return false;
		}
	}
}
