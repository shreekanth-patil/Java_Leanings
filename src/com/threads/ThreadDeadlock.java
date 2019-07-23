package com.threads;

public class ThreadDeadlock {

	public static void main(String[] args) throws InterruptedException {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		Thread t1 = new Thread(new SyncThread(obj1, obj2), "t1"); // t1 gets lock on obj1, obj2
		Thread t2 = new Thread(new SyncThread(obj2, obj3), "t2"); // t2 tries to gets lock on obj2, gets obj3
		Thread t3 = new Thread(new SyncThread(obj3, obj1), "t3");// t3 tries to get lock on obj3 and obj1
// Avoid Nested Locks in order to avoid deadlock
		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(5000);
		t3.start();

	}

}

class SyncThread implements Runnable {
	private Object obj1;
	private Object obj2;

	public SyncThread(Object o1, Object o2) {
		this.obj1 = o1;
		this.obj2 = o2;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " acquiring lock on " + obj1);
		synchronized (obj1) {
			System.out.println(name + " acquired lock on " + obj1);
			work();
			System.out.println(name + " acquiring lock on " + obj2);
			synchronized (obj2) {
				System.out.println(name + " acquired lock on " + obj2);
				work();
			}
			System.out.println(name + " released lock on " + obj2);
		}
		System.out.println(name + " released lock on " + obj1);
		System.out.println(name + " finished execution.");
	}

	private void work() {
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}