package com.exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author shreekanth
 *
 *         To Avoid ConcurrentModificationException in multi-threaded
 *         environment:
 * 
 *         1. You can convert the list to an array and then iterate on the
 *         array. This approach works well for small or medium size list but if
 *         the list is large then it will affect the performance a lot.
 * 
 *         2. You can lock the list while iterating by putting it in a
 *         synchronized block. This approach is not recommended because it will
 *         cease the benefits of multithreading.
 * 
 *         3. If you are using JDK1.5 or higher then you can use
 *         ConcurrentHashMap and CopyOnWriteArrayList classes. It is the
 *         recommended approach.
 * 
 *         To Avoid ConcurrentModificationException in single-threaded
 *         environment: You can use the iterator remove() function to remove the
 *         object from underlying collection object. But in this case you can
 *         remove the same object and not any other object from the list.
 */
public class FixConcurrentModificationException {
	
	public static void main(String[] args) {

	
	 List<String> myList = new CopyOnWriteArrayList<String>(); // This has fixed the exception. 
	 // if you change this to ArrayList<String>(); it will throw ConcurrentModificationException at itr.next
	 
	 myList.add("1");
     myList.add("2");
     myList.add("3");
     myList.add("4");
     myList.add("5");

     Iterator<String> it = myList.iterator();
     while(it.hasNext()){
         String value = it.next();
         System.out.println("List Value:"+value);
         if(value.equals("3")){
             myList.remove("4");
             myList.add("6");
             myList.add("7");
         }
     }
     System.out.println("List Size:"+myList.size());

     Map<String,String> myMap = 
          new ConcurrentHashMap<String,String>();
     myMap.put("1", "1");
     myMap.put("2", "2");
     myMap.put("3", "3");

     Iterator<String> it1 = myMap.keySet().iterator();
     while(it1.hasNext()){
         String key = it1.next();
         System.out.println("Map Value:"+myMap.get(key));
         if(key.equals("1")){
             myMap.remove("3");
             myMap.put("4", "4");
             myMap.put("5", "5");
         }
     }

     System.out.println("Map Size:"+myMap.size());
 }


}
