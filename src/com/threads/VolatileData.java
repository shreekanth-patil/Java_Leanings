package com.threads;

public class VolatileData {
	private volatile  int counter;

	public int getCounter() {
		return counter;
	}

	public void increaseCounter() {
		counter = counter+1;
	}

}
