package com.misc.shallowcopy;

/**
 * @author shreekanth The default version of clone() method creates the shallow
 *         copy of an object. The shallow copy of an object will have exact copy
 *         of all the fields of original object. If original object has any
 *         references to other objects as fields, then only references of those
 *         objects are copied into clone object, copy of those objects are not
 *         created.
 * 
 *         ‘student1‘ is an object of ‘Student‘ class which has three fields –
 *         id, name and course. ‘course‘ is a reference variable pointing to a
 *         ‘Course‘ type object. Clone of ‘student1‘ is created by calling clone
 *         method on it and assigned it to ‘student2‘. As default version of
 *         clone method creates the shallow copy, the ‘course‘ field of both
 *         ‘student1‘ and ‘student2‘ will be pointing to same ‘Course‘ object.
 *         So, any changes made to this object through ‘student2‘ will be
 *         reflected in ‘student1‘ or vice-versa.
 */
public class ShallowCopyInJava {
	public static void main(String[] args) {
		
		Course science = new Course("Physics", "Chemistry", "Biology");

		Student student1 = new Student(111, "John", science);

		Student student2 = null;

		try {
			// Creating a clone of student1 and assigning it to student2

			student2 = (Student) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the subject3 of 'student1'

		System.out.println(student1.course.subject3); // Output : Biology

		// Changing the subject3 of 'student2'

		student2.course.subject3 = "Maths";

		// This change will be reflected in original student 'student1'

		System.out.println(student1.course.subject3); // Output : Maths
	}
}