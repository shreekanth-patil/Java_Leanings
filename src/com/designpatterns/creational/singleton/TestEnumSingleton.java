package com.designpatterns.creational.singleton;

public class TestEnumSingleton {

	public static void main(String args[]){
		EnumSingleton singleton = EnumSingleton.INSTANCE;
		if(singleton==null){
			System.out.println("Its null");
		}
		System.out.println(singleton.hashCode());
		EnumSingleton singleton2 = EnumSingleton.INSTANCE;
		System.out.println(singleton2.hashCode());
		if(singleton2.equals(singleton)){
			System.out.println("Its single object");
		}
	}
}
