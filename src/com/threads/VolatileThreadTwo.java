package com.threads;

public class VolatileThreadTwo extends Thread {
	private final VolatileData data;

	public VolatileThreadTwo(VolatileData data) {
		this.data = data;
	}

	@Override
	public void run() {
		int oldValue = data.getCounter();
		System.out.println("[VolatileThreadTwo " + Thread.currentThread().getId()
				+ "]: Old value = " + oldValue);
		data.increaseCounter();
		int newValue = data.getCounter();
		System.out.println("[VolatileThreadTwo " + Thread.currentThread().getId()
				+ "]: New value = " + newValue);
	}

}
