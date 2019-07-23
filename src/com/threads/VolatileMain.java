package com.threads;

public class VolatileMain {
	private final static int TOTAL_THREADS = 2;

	public static void main(String[] args) throws InterruptedException {
		
		VolatileData volatileData = new VolatileData();
		Thread[] threads = new Thread[TOTAL_THREADS];
		threads[0] = new VolatileThreadOne(volatileData);
		threads[0].start();
		System.out.println("The value in main "+ volatileData.getCounter());
		threads[1] = new VolatileThreadTwo(volatileData);
		threads[1].start();
		System.out.println("The value in main last "+ volatileData.getCounter());
	}

}
