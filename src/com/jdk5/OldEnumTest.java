package com.jdk5;

/**
 * @author shreekanth
 * 
 * 
 * 
 *      There is no type-safety for enum values because compiler can accept
 *         any integer number for ‘int’ variable. We can’t stop somebody from
 *         passing outside range values to enum variable. For example, we can
 *         call printAppointment() method with value 10 or even -25, compiler
 *         won’t complain that this is not valid even though we are expecting a
 *         number between 0 and 6.
 * 
 *     Another issue is that the value displayed would be a number which is
 *         not informative. By seeing that number we do not know which enum
 *         value it is referring to, moreover we do not even know that it is an
 *         enum because of the number. You can understand this better by seeing
 *         the above output.
 * 
 */
public class OldEnumTest {

	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6;

	void printAppointment(int day) {
		System.out.println(" Please come on " + day);
	}

	public static void main(String[] args) {
		new OldEnumTest().printAppointment(FRIDAY);
		
		new OldEnumTest().printAppointment(5); // not readable to which enum field it refers.
		
		new OldEnumTest().printAppointment(100); // compiler wont complain even its not in range
	}

}
