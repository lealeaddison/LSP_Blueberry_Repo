package org.howard.edu.lsp.finalexam.question2;

// using RandomNumberStrategy from https://en.wikipedia.org/wiki/Linear_congruential_generator

public class LCGRandomStrategy implements RandomNumberStrategy {
	private long seed;
	
	// constants for LCG
	private static final long A = 1664525;
	private static final long C = 1013904223;
	private static final long M = (long) Math.pow(2,  32);
		
	public LCGRandomStrategy(long seed) {
		this.seed = seed;
	}
	
	@Override
	public int generateRandomNumber() {
		seed = (A * seed + C) % M;
		return (int) seed;
	}
}