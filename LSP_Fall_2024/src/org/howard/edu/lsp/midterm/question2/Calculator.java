package org.howard.edu.lsp.midterm.question2;

public class Calculator {
	
	/**
	 * returns sum of two ints
	 * @param a the first int
	 * @param b the second int
	 * @return the sum of a and b
	 */
	

	public static int sum(int a, int b) {
		return a + b;
	}
	/**
	 * returns sum of two double values
	 * @param a the first double
	 * @param b the second double
	 * @param the sum of a and b
	 */
	
	public static double sum(double a, double b) {
		return a + b;
	}
	
	/**
	 * returns sum of all elements in a list
	 * @param numbers the list of ints
	 * @return sum of all elements in list
	 */
	
	public static int sum(int[] numbers) {
		int total = 0;
		for (int number: numbers) {
			total += number;
		}
		return total;
	}
}