package com.misc;

public class InstaceVariables {
	
	public int i;
	
	public static void main(String args[]){
		int a = 0;
		InstaceVariables obj = new InstaceVariables();
		System.out.println("The value of instance variable is "+obj.i);
		System.out.println("The value of local "+ a);
	}

}
