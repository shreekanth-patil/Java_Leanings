package com.misc;

import java.util.HashSet;
import java.util.Set;

public class Name extends Object {
	private String first, last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public boolean equals(Object o) {
		if (!(o instanceof Name))
			return false;
		Name n = (Name) o;
		return n.first.equals(first) && n.last.equals(last);
	}

	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(new Name("Donald", "Duck"));
		System.out.println(s.contains(new Name("Donald", "Duck")));
	}
}