package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author shreekanth
 * 
 *  To avoid java.io.InvalidClassException; we require to add
 *         serialVersionUID number which will be same in servialize and
 *         deserialized object for JVM to make user the object being
 *         serialize/deserialize is the same
 * 
 */
public class SerializationUIDTester {
	

	public static void main(String args[]) throws Exception {
		
		File file = new File("temp.ser");
		/**
		 * Ojbect serialization process; Once you write to temp.ser file, change
		 * SerializationUIDTest.serialVersionUID and then read file by just commenting below
		 * block of code(dont serialize again) just read you should be getting
		 * java.io.InvalidClassException
		 */
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		SerializationUIDTest writeSUID = new SerializationUIDTest(2);
		oos.writeObject(writeSUID);
		oos.close();
		/*------serialization ends------*/

		
		/*------Object deserialization process(reading from file); ------*/
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		SerializationUIDTest readSUID = (SerializationUIDTest) ois.readObject();
		System.out.println("someId : " + readSUID.getSomeId());
		ois.close();
		/*--------deserialization ends----*/
	}
}