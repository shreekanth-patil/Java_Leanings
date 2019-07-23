package com.datastructures.map;

public class User {

	private String name;
	private int sal;
	private int age;

	public User(String name, int sal, int age) {
		this.name = name;
		this.sal = sal;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean equals(Object anObject) {
		boolean flag = false;
		if (anObject == this)
			return true;
		if (anObject instanceof User) {
			User user = (User) anObject;
			flag = user.getName().equals(this.getName());
		}
		return flag;
	}

	public int hashCode() {

		return this.getName().length() * (10 + 5);

	}

}
