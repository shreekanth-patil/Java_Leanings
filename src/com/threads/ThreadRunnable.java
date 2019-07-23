package com.threads;

public class ThreadRunnable {


	public static void main(String[] args) {
		Runnable r = new RunnableThreadOne();
		Thread t = new Thread(r);

		System.out.println("Odd numbers listed as below");
		t.start();

		Runnable r2 = new RunnableThreadTwo();
		Thread t2 = new Thread(r2);

		System.out.println("Even numbers listed as below");
		t2.start();
	}
}

class RunnableThreadOne implements Runnable {

	public void run() {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}
	}
}

class RunnableThreadTwo implements Runnable {
	
	public void run() {
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
