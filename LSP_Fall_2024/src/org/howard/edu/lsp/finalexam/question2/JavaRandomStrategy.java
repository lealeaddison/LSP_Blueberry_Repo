package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

public class JavaRandomStrategy implements RandomNumberStrategy {
	private Random random;
	
	public JavaRandomStrategy() {
		random = new Random();
	}
	
	@Override
	public int generateRandomNumber() {
		return random.nextInt(Integer.MAX_VALUE) + 1;
	}
}