package com.misc;

import java.util.HashSet;
import java.util.Set;

public class Puzzling {
	public static void main(String[] args) {
		MyString s = new MyString("blah");
		System.out.println(s);
	}
}

class MyString {
	java.lang.String s;

	public MyString(java.lang.String s) {
		this.s = s;
	}

	public java.lang.String toString() {
		return s;
	}

	public static void main(String args[]) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);
		Point p3 = new Point(4, 5);
		Point p4 = new Point(6, 7);
		Point p5 = new Point(6, 7);
		Point p6 = new Point(6, 7);
		Point p7 = new Point(6, 7);

		Set<Point> set = new HashSet<Point>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		set.add(p1);
		set.add(p6);
		set.add(p7);

		System.out.println(set.size());

	}
}

class Point {
	int x;
	int y;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		return ((this.x + this.y) * 2);
	}

	@Override
	public boolean equals(Object o) {
		Point p = (Point) o;
		boolean flag = false;
		if (p.getX() == this.getX() && p.getY() == this.getY()) {
			flag = true;
		}
		return flag;

	}

}
