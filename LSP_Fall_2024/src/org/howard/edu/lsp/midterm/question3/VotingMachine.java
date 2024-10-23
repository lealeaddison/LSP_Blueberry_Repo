package org.howard.edu.lsp.midterm.question3;

public class VotingMachine {
	// initializing lists to store candidate names and their respective vote counts
	private String[] candidateNames;
	private int[] votes;
	private int count; // num of candidates
	
	// constructor
	public VotingMachine() {
		candidateNames = new String[100]; // max of 100 candidates
		votes = new int[100];
		count = 0;
	}
	// adding a new candidate
	public void addCandidate(String name) {
		// checking if candidate already exists
		for (int i = 0; i < count; i++) {
			if (candidateNames[i].equals(name)) {
				System.out.println("Candidate " + name + " already exists.");
				return;
			}
		}
		// adding candidate to list
		candidateNames[count] = name;
		votes[count] = 0;
		count++;
	}
	public void castVote(String name) {
		// finding candidate in the list and increment vote count
		for (int i = 0; i < count; i++) {
			if (candidateNames[i].equals(name)) {
				votes[i]++;
				return;
			}
		}
		System.out.println("Candidate " + name + " does not exist.");
	}
	// printing results
	public void printResults() {
		for (int i = 0; i < count; i++) {
			System.out.println(candidateNames[i] + ": "  + votes[i] + " votes");
		}
	}
}
