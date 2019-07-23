package com.serialization;

import java.io.Serializable;

/**
 * @author shreekanth
 * 
 *         Lets say you created a class, instantiated it, and wrote it out to an
 *         object stream. That flattened object sits in the file system for some
 *         time. Meanwhile, you update the class file, perhaps adding a new
 *         field. Now try to read the flattened object. hmmmm.. An exception
 *         "java.io.InvalidClassException" will be thrown.
 * 
 * 
 *  The solution is very simple. Instead of relying on the JVM to
 *         generate the serialVersionUID, you explicitly mention (generate) the
 *         serialVersionUID in your class. The syntax is:
 * 
 *         private final static long serialVersionUID = <integer value>
 * 
 */
class SerializationUIDTest implements Serializable {
	
	/**
	 * serialVersionUID 
	 */
	private static final long serialVersionUID = 3L;

	private int someId;

	public SerializationUIDTest(int someId) {
		this.someId = someId;
	}

	public int getSomeId() {
		return someId;
	}
}
