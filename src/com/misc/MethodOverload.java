package com.misc;

public class MethodOverload {
	
	public void method(String a){
		System.out.println("string called");
	}
	
	public void method(Boolean a){
		System.out.println("Boolean called");
	}
	
	public void method(Object a){
		System.out.println("Object called");
	}
	
	public void method(Exception a){
		System.out.println("Integer called");
	}
	
	public void method(Name a){
		System.out.println("Float called");
	}
	
	public static void main(String args[]){
		MethodOverload obj = new MethodOverload();
		//obj.method(null);
	}

}
