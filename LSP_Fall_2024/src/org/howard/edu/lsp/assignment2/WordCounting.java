package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCounting {

	public static void main(String[] args) throws IOException {
		
		// read the text file and store in a string
		// change 'filename' to name of txt file
		BufferedReader reader = new BufferedReader (new FileReader("src/org/howard/edu/lsp/assignment2/test1.txt"));
		String line;
		HashMap<String, Integer> wordCount = new HashMap<>();
		
		// trivial words to exclude
		Set<String> trivialWords = new HashSet<>();
		trivialWords.add("the");
		trivialWords.add("and");
		trivialWords.add("for");
		trivialWords.add("but");
		trivialWords.add("it");
		trivialWords.add("of");

		
		// split the string into words
		while ((line = reader.readLine()) != null) {
			String[] words = line.split("[^a-zA-Z]+");
			
			// skip empty words
			for (String word : words) {
				if (word.isEmpty()) {
					continue;
				}
				
				// convert the word to lower case
				word = word.toLowerCase();
				
				// skip trivial words but not exclude other 3 letter words
				if (word.length() <= 3 && trivialWords.contains(word)) {
					continue;
				}
				
				// count the words
				if (wordCount.containsKey(word)) {
					wordCount.put(word,  wordCount.get(word) + 1);
				} else {
					wordCount.put(word,  1);
				}
				}
				}
		reader.close();
		
		// print the results
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
			}
		}
		