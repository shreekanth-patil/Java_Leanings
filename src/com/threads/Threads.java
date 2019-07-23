package com.threads;

public class Threads extends Thread {

	public volatile int num;

	public static void main(String args[]) {

		Threads oneThread = new Threads();
		Threads secThread = new Threads();

		oneThread.setName("one");
		secThread.setName("two");

		oneThread.start();
		secThread.start();
	}

	@Override
	public void run() {
		System.out.println("Thread started.."
				+ Thread.currentThread().getName());
		
		//increment logic
		for (int i = 0; i <10; i++) {
			num=num+i;
			System.out.println("The value incremented is " +num );
		}
		
		//decrement logic
		for (int i = 0; i <10; i++) {
			
			System.out.println("The value decremented is " + num);
		}
	}

}
