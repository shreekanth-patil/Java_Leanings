package com.misc;

/*
 * When multiple overloadings apply, the most specific wins
 */
public class Confusing {
	

	public Confusing(Object dArray) {
		System.out.println("double array");
	}
	
	public Confusing(Integer dArray) {
		System.out.println("Integer ");
	}
	
	

	public Confusing(int o) {
		System.out.println("Object");
	}
	
	public static void main(String args[]) {
		new Confusing(null);
	}
}