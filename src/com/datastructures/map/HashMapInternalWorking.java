package com.datastructures.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * @author shreekanth Run this program in debug mode to see and understand the
 *         put and get method working and how data is organized in
 *         table/bucket/singly-linked-list
 *
 */
public class HashMapInternalWorking {

	public static void main(String args[]) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("abcdef", 1);
		map.put("abcdfG", 2);
		map.put("abcdefH", 3);
		System.out.println("size is "+ map.size());
		System.out.println("HashMap keys as below : using Iterator");
		Iterator<String> keyIter = map.keySet().iterator();
		while (keyIter.hasNext()) {
			String o = keyIter.next();
			System.out.println(o + " with has code " + o.hashCode());
			
		}

		System.out.println("HashMap values as below : using Iterator ");
		Iterator<Integer> valueIter = map.values().iterator();
		while (valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}

		System.out
				.println("HashMap values as below : using Entry<String, Integer> ");
		Iterator<Entry<String, Integer>> mapEntry = map.entrySet().iterator();
		while (mapEntry.hasNext()) {
			System.out.println(mapEntry.next());
		}

		System.out.println("=========== map.get ===============");
		System.out.println(map.get("abcdef"));
		System.out.println(map.get("abcdfG"));
		System.out.println(map.get("abcdefH"));

	}

}
