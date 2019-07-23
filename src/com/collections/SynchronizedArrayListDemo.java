package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author shreekanth
 *
 *         Here is the complete example of synchronizing an ArrayList in Java.
 *         If you look, we have created a List of String and added couple of
 *         elements on it. . Then we passed this ArrayList to
 *         
 *         Collections.synchronizedList() method, which returned a thread-safe,
 *         synchronized version of backed list. You can now safely share this
 *         list among multiple thread, but you need to be little bit careful
 *         while retrieving or removing elements from ArrayList. In order to
 *         have safe access you should use Iterator for getting and removing
 *         elements from the list and that to in synchronized manner as shown in
 *         this example.
 */
public class SynchronizedArrayListDemo {

	public static void main(String args[]) {
		
		// An ArrayList which is not synchronize
		List<String> listOfSymbols = new ArrayList<String>();
		
		listOfSymbols.add("RELIANCE");
		listOfSymbols.add("TATA");
		listOfSymbols.add("TECHMAH");
		listOfSymbols.add("HDFC");
		listOfSymbols.add("ICICI"); 
		
		// Synchronizing ArrayList in Java
		listOfSymbols = Collections.synchronizedList(listOfSymbols);
		
		// // While Iterating over synchronized
		// list, you must synchronize // on it to
		// avoid non-deterministic behavior
		synchronized (listOfSymbols) {
			Iterator<String> myIterator = listOfSymbols.iterator();
			while (myIterator.hasNext()) {
				System.out.println(myIterator.next());
			}
		}
	}

}
