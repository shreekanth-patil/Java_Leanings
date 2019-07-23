package com.jdk7;

/*
 * To construct a custom resource that will be correctly handled by a 
 * try-with-resources block, the class should implement the Closeable 
 * or AutoCloseable interfaces, and override the close method:
 */
public class MyResource implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("Closed MyResource");
	}
}
