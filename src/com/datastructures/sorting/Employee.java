package com.datastructures.sorting;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private String firstName;
	private String lastName;
	private int id;

	public Employee(String firstName, String lastName, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int compareTo(Employee o) {

		return this.id - o.getId();
	}

	public static Comparator<Employee> FirstNameComparator = new Comparator<Employee>() {

		public int compare(Employee emp1, Employee emp2) {
			// ascending order
			return emp1.getFirstName().toUpperCase().compareTo(emp2.getFirstName().toUpperCase());
			// descending order
			// return fruitName2.compareTo(fruitName1);
		}
	};

	public static Comparator<Employee> LastNameComparator = new Comparator<Employee>() {

		public int compare(Employee emp1, Employee emp2) {
			// ascending order
			return emp1.getLastName().toUpperCase().compareTo(emp2.getLastName().toUpperCase());
			// descending order
			// return fruitName2.compareTo(fruitName1);
		}
	};
	
	public static Comparator<Employee> empIDComparator = new Comparator<Employee>() {

		public int compare(Employee emp1, Employee emp2) {
			// ascending order
			return emp1.getId()- emp2.getId();
			// descending order
			// return fruitName2.compareTo(fruitName1);
		}
	};

}
