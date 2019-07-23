package com.exceptions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author shreekanth
 * 
 *         Java Collection classes are fail-fast which means that if the
 *         Collection will be changed while some thread is traversing over it
 *         using iterator, the iterator.next() will throw a
 *         ConcurrentModificationException.
 *         
 *         This situation can come in case of multithreaded as well as single threaded environment.
 *
 */
public class ConcurrentModificationException {
	
	public static void main(String args[]){
        List<String> myList = new ArrayList<String>();
 
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
 
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println("List Value:"+value);
            if(value.equals("3")) myList.remove(value);
        }
 
        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
 
        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("2")){
                myMap.put("1","4");
                //myMap.put("4", "4");
            }
        }
	}

}
