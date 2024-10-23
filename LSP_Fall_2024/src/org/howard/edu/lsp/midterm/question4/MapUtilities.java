package org.howard.edu.lsp.midterm.question4;

public class MapUtilities {
	
	/**
	 * returns the num of common key/values pairs between two HashMaps
	 * @param map1 the first HashMap
	 * @param map2 the second HashMap
	 * @return the num of key-value pairs that the hashmaps share
	 */
	public static int commonKeyValuePairs(java.util.HashMap<String, String> map1, java.util.HashMap<String, String> map2) {
		// if either map is empty, return 0
		if (map1.isEmpty() || map2.isEmpty()) return 0;
		
		int count = 0;
		
		// iterate over first hashmap
		for (String key : map1.keySet()) {
			// checking if both maps have same key and same value
			if (map2.containsKey(key) && map2.get(key).equals(map1.get(key))) {
				count++;
			}
		}
		return count;
	}
}