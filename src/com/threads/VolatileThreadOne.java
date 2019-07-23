package com.threads;

public class VolatileThreadOne extends Thread {
	private final VolatileData data;

	public VolatileThreadOne(VolatileData data) {
		this.data = data;
	}

	@Override
	public void run() {
		int oldValue = data.getCounter();
		System.out.println("[VolatileThreadOne " + Thread.currentThread().getId() + "]: Old value = " + oldValue);
		data.increaseCounter();
		int newValue = data.getCounter();
		System.out.println("[VolatileThreadOne " + Thread.currentThread().getId() + "]: New value = " + newValue);
	}

}
