package com.jdk5;

/**
 * @author shreekanth
 * 
 * 
 *     Here, compiler accepts only those values which are defined in enum
 *         ‘Day’ to be passed to printAppointment() method, thus providing
 *         compile time type-safety. Also, the output is so informative that we
 *         can understand very easily.
 * 
 * 
 */
public class TypeSafeEnum {

	public enum Day {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	void printAppointment(Day day) {
		System.out.println(" Please come on " + day);
	}

	public static void main(String[] args) {
		new TypeSafeEnum().printAppointment(Day.TUESDAY); // more readable
		
		// new TypeSafeEnum().printAppointment(10); compiler complains
		
		
	}

}
