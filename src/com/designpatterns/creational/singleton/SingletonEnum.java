package com.designpatterns.creational.singleton;

/**
 * @author shreekanth
 * 
 *         To overcome this situation with Reflection, Joshua Bloch suggests the
 *         use of Enum to implement Singleton design pattern as Java ensures
 *         that any enum value is instantiated only once in a Java program.
 *         Since Java Enum values are globally accessible, so is the singleton.
 *         The drawback is that the enum type is somewhat inflexible; for
 *         example, it does not allow lazy initialization
 * 
 *  Enum is thread safe and implementation of Singleton through Enum
 *         ensures that your singleton will have only one instance even in a
 *         multithreaded environment.
 * 
 */
enum SingletonEanums {

	INSTANCE;
	public void doStuff() {
		System.out.println("Singleton using Enum");
	}
}

public class SingletonEnum {
	public static void main(String[] args) {
		SingletonEanums.INSTANCE.doStuff();

	}

}
