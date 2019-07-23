package com.designpatterns.creational.factory;

/**
 * @author shreekanth
 * 
 *         Factory Pattern 
 *         ----------------
 *         Factory Pattern is one of the
 *         Creational Design pattern and it’s widely used in JDK as well as
 *         frameworks like Spring and Struts.
 * 
 *         Factory design pattern is used when we have a super class with
 *         multiple sub-classes and based on input, we need to return one of the
 *         sub-class. This pattern take out the responsibility of instantiation
 *         of a class from client program to the factory class.
 * 
 *         Benefits 
 *         ----------- 
 *         Factory pattern provides approach to code for
 *         interface rather than implementation. Factory pattern removes the
 *         instantiation of actual implementation classes from client code,
 *         making it more robust, less coupled and easy to extend. For example,
 *         we can easily change PC class implementation because client program
 *         is unaware of this. Factory pattern provides abstraction between
 *         implementation and client classes through inheritance.
 * 
 */
public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		
		if ("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("Server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}

		return null;
	}
}