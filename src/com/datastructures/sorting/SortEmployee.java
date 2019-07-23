package com.datastructures.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class SortEmployee {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		Employee empOne = new Employee("Anil", "kumar", 10);
		Employee empTwo = new Employee("sunil", "chanda", 9);
		Employee empThree = new Employee("kiran", "shetty", 11);
		Employee empFour = new Employee("bhaskar", "adube", 20);

		empList.add(empOne);
		empList.add(empTwo);
		empList.add(empThree);
		empList.add(empFour);

		// 1. Sorts based on emp id
		Collections.sort(empList);

		// 2.Sorting based on first name
		// Collections.sort(empList, Employee.FirstNameComparator);

		// 3.Sorting based on last name
		 Collections.sort(empList, Employee.LastNameComparator);

		// 4.Sorting based on emp id
		// Collections.sort(empList, Employee.empIDComparator);

		// Iteratring employee object
		for (Employee e : empList) {
			System.out.println(e.getFirstName() + " " + e.getLastName() + " "+ e.getId());
		}
		
	}

}
