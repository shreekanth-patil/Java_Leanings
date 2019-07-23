package com.misc.shallowcopy;

class Student implements Cloneable {
	int id;

	String name;

	Course course;

	public Student(int id, String name, Course course) {
		this.id = id;

		this.name = name;

		this.course = course;
	}

	// Default version of clone() method. It creates shallow copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
