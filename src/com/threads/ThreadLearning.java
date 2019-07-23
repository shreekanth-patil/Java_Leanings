package com.threads;

public class ThreadLearning extends Thread {

	
	 volatile int  num;

	public static void main(String args[]) {

		Thread t1 = new ThreadLearning();
		t1.start();
		Thread t2 = new ThreadLearning();
		t2.start();

	}

	public void run() {
     num = num +1;
     System.out.println("The value of x modified by thread "
				+ Thread.currentThread().getName()
				+ " now, reflected in main thread as its volatile "+ num);

	}

}
