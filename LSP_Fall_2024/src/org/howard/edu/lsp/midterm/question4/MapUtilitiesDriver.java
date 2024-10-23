package org.howard.edu.lsp.midterm.question4;

public class MapUtilitiesDriver {
	public static void main(String [] args) {
		// creating map 1
		java.util.HashMap<String, String> map1 = new java.util.HashMap<>();
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecstatic");
		map1.put("Bob", "Happy");
		map1.put("Chuck", "Fine");
		map1.put("Felix", "Sick");
		
		// creating map 2
		java.util.HashMap<String, String> map2 = new java.util.HashMap<>();
		map2.put("Mary", "Ecstatic");
		map2.put("Felix", "Healthy");
		map2.put("Ricardo", "Suprb");
		map2.put("Tam", "Fine");
		map2.put("Bob", "Happy");
		
		// testing common pairs
		int commonPairs = MapUtilities.commonKeyValuePairs(map1, map2);
		System.out.println("Number of common key/value pairs is: " + commonPairs);
	}
}