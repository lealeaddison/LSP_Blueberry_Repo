package org.howard.edu.lsp.midterm.question3;

public class VotingMachineDriver {
	public static void main(String[] args) {
		VotingMachine vm = new VotingMachine();
		
		// adding candidates
		vm.addCandidate("Alsobrooks");
		vm.addCandidate("Hogan");
		
		// casting vote
		vm.castVote("Alsobrooks");
		vm.castVote("Alsobrooks");
		vm.castVote("Hogan");
		
		// print results
		vm.printResults();
	}
}