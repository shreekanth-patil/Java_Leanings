package com.designpatterns.creational.singleton;

/**
 * @author shreekanth
 * 
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method. 
 * 
 * This  implementation works fine incase of single threaded environment but when it comes to multithreaded systems,
 * it can cause issues if multiple threads are inside the if loop at the same time.
 * It will destroy the singleton pattern and both threads will get the different instances of singleton class.
 * 
 *
 */

public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instance;

	private LazyInitializedSingleton() {
	}

	public static LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

}
