package com.misc.deepcopy;

class Student implements Cloneable {
	int id;

	String name;

	Course course;

	public Student(int id, String name, Course course) {
		this.id = id;

		this.name = name;

		this.course = course;
	}

	// Overriding clone() method to create a deep copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();

		student.course = (Course) course.clone();

		return student;
	}
}