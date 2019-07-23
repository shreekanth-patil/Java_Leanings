package com.misc;

class Base {
	public String name = "Base";

	public void display(double d) {
		System.out.println("The double is d " + d);
	}
}

class Derived extends Base {
	private String name = "Derived";

	public void display(int d) {
		System.out.println("The int is d " + d);
	}
}

public class PrivateMatter {
	private String name = "Derived";

	public static void main(String[] args) {
		System.out.println(new PrivateMatter().name); // new Derived().name you
														// cant access private
														// of derived

		Derived obj = new Derived();
		Base b = obj;
		b.display(5);
		obj.display(5);

	}
}
