package com.datastructures.map;


import java.util.HashMap;
import java.util.Iterator;

public class UserHashMapDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User userOne = new User("anil",1234,19);
		User userTwo = new User("sunilfff",12345,19);
		User userThree = new User("anil",1234,19);
		User four = new User("anil",1234,19);
		User five = new User("anil",1234,19);
		
		
		HashMap<User, String> hm = new HashMap<User, String>();
		
		hm.put(userOne, "a");
		hm.put(userTwo, "b");
		hm.put(four, "e");
		hm.put(userThree, "d");
		hm.put(five, "c");
		
		System.out.println(hm.size());
	}
}
