package com.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapKeyWithWordCountInStringArray {

	public static void main(String args[]) {
		String[] stringArrays = { "Red", "White", "Red", "Black", "White",
				"Blue", "BLUE" };

		Map<String, Integer> resultedMap = findDuplicateString(stringArrays);

		for (Map.Entry<String, Integer> entry : resultedMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		Map<String, Integer> resultedMapOtimized = findDuplicateStringOptimized(stringArrays);
		System.out.println("Now optimized....");
		for (Map.Entry<String, Integer> entry : resultedMapOtimized.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		Map<String, Integer> resultedMapOtimized2 = findDuplicateStringCountValue(stringArrays);
		System.out.println("resultedMapOtimized2 Now optimized....");
		for (Map.Entry<String, Integer> entry : resultedMapOtimized2.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}

	/**
	 * @param string
	 * @return map which contain the word and value as the no of repatation
	 */
	public static Map<String, Integer> findDuplicateString(String[] stringArrays) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<String> words = new HashSet<String>(Arrays.asList(stringArrays));
		int count = 0;
		for (String word : words) {
			for (String temp : stringArrays) {
				if (word.equalsIgnoreCase(temp)) {
					++count;
				}
			}
			map.put(word, count);
			count = 0;
		}

		return map;

	}

	/**
	 * @param stringArrays
	 * @return
	 */
	public static Map<String, Integer> findDuplicateStringOptimized(
			String[] stringArrays) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String key : stringArrays) {
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);

			} else {
				map.put(key, 1);
			}
		}
		return map;

	}

	public static Map<String, Integer> findDuplicateStringCountValue(
			String[] strArray) {
		
		Map<String, Integer> duplicatCountMap = new HashMap<String, Integer>();
		List<String> paraList = Arrays.asList(strArray);
        for (int j = 0; j < strArray.length; j++) {
	            int count = 0;
	            for (int i = 0; i < strArray.length; i++) {
	                if (paraList.get(j).equalsIgnoreCase(paraList.get(i))) {
	                    count++;
	                    duplicatCountMap.put(paraList.get(j), count);
	                }

	            }

	        }
        return duplicatCountMap;
	}

}