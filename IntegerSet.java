package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet  {
	// Store the set elements in an ArrayList.
	private List<Integer> set = new ArrayList<Integer>();

	// Default Constructor
	public IntegerSet() {
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set. 5 pts.
	public void clear() {
		set.clear();
	}
	
	// Returns the length of the set. 5 pts.
	public int length() {
		return set.size();
	}
	
	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
	 * the equal method from the Object class. 10 pts.
	*/
	
	public boolean equals(Object o) {
		if (o instanceof String) {
			String b = (String) o;
			if (set.size() != b.length()) {
			return false;
		}
		for (int i = 0; i < set.size(); i++) {
			if (!b.contains(set.get(i).toString())) {
				return false;
			}
		}
		return true;
	}
	return false;
	}
		
	// Returns true if the set contains the value, otherwise false. 5 pts.
	public boolean contains(int value) {
		return set.contains(value);
	}
	
	// Returns the largest item in the set. 5 pts.
	public int largest() {
		int max = set.get(0);
		for (int i = 1; i < set.size(); i++) {
			if (set.get(i) > max) {
				max = set.get(i);
			}
		}
		return max;
	}
	
	// Returns the smallest item in the set. 5 pts.
	public int smallest()  {
		int min = set.get(0);
		for (int i = 1; i < set.size(); i++) {
			if (set.get(i) < min) {
				min = set.get(i);
			}
		}
		return min;
	}
	
	
	// Adds an item to the set or does nothing it already there. 5 pts.	
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);
		}
	}
	
	// Removes an item from the set or does nothing if not there. 5 pts.
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}
	
	// Set union. 11 pts.
	public void union(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			int item = intSetb.set.get(i);
			if (!set.contains(item)) {
				set.add(item);
			}
		}
	}
	
	// Set intersection, all elements in s1 and s2. 12 pts.
	public void intersect(IntegerSet intSetb) {
		List<Integer> newSet = new ArrayList<Integer>();
		for (int i = 0; i < intSetb.length(); i++) {
			int item = intSetb.set.get(i);
			if (set.contains(item)); {
				newSet.add(item);
			}
		}
		set = newSet;
	}
	
	// Set difference, i.e., s1 –s2. 12 pts.
	public void diff(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			int item = intSetb.set.get(i);
			set.remove(Integer.valueOf(item));
		}
	}
	
	// Set complement, all elements not in s1. 11 pts.
	public void complement(IntegerSet intSetb) {
		for (int i = 0; i < intSetb.length(); i++) {
			int item = intSetb.set.get(i);
			set.remove(Integer.valueOf(item));
		}
	}
	
	// Returns true if the set is empty, false otherwise. 5 pts.
	boolean isEmpty() {
		return set.isEmpty();
	}
	
	// Return String representation of your set.  This overrides the equal method from 
	// the Object class. 5 pts.
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (int i = 0; i < set.size(); i++) {
			sb.append(set.get(i));
			if (i < set.size() - 1) {
				sb.append(", ");
			}
		}
		sb.append("}");
		return sb.toString();
		}
	}
