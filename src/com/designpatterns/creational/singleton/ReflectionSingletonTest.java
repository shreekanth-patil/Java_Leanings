package com.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

/**
 * @author shreekanth
 * 
 *         This breaks the singleton pattern!!!!!!!
 * 
 *  To overcome this situation with Reflection, Joshua Bloch suggests the
 *         use of Enum to implement Singleton design pattern as Java ensures
 *         that any enum value is instantiated only once in a Java program.
 *         Since Java Enum values are globally accessible, so is the singleton.
 *         The drawback is that the enum type is somewhat inflexible; for
 *         example, it does not allow lazy initialization.
 *         
 *  Solution : SingletonEnums.java - using enum to create singleton objects
 * 
 */
public class ReflectionSingletonTest {

	public static void main(String[] args) {
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton instanceTwo = null;
		
		try {
			Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				
				instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

}
