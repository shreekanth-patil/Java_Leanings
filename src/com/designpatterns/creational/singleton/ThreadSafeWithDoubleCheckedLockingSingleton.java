package com.designpatterns.creational.singleton;



/**
 * @author shreekanth
 * 
 *  Double Checked Locking Principle
 *  ---------------------------------
 *  To avoid synchronized method and improve performance, double checked locking principle is used. In this approach, 
 *  the synchronized block is used inside the if condition with an additional check to ensure that only 
 *  one instance of singleton class is created.
 *
 */
public class ThreadSafeWithDoubleCheckedLockingSingleton {
	
	private static volatile  ThreadSafeWithDoubleCheckedLockingSingleton instance;

	private ThreadSafeWithDoubleCheckedLockingSingleton() {
		
	}

	/**
	 * Removed synchronized on method; Instead, if instance is null then have synchrozed block to create instance.
	 */
	public static ThreadSafeWithDoubleCheckedLockingSingleton getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeWithDoubleCheckedLockingSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeWithDoubleCheckedLockingSingleton();
				}
			}
		}
		return instance;
	}

}
