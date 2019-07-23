package com.designpatterns.creational.singleton;

public class TestSingletons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EagerInitializedSingleton eagerSingleton = EagerInitializedSingleton.getInstance();
		
		System.out.println("The eager singleton object created:: " + eagerSingleton);
		
		StaticBlockSingleton staticblockSingleton = StaticBlockSingleton.getInstance();
		
		System.out.println("The static blok singleton object created:: " + staticblockSingleton);

	}

}
