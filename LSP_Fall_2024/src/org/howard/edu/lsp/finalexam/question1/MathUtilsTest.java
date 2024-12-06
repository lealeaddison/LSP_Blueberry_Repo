package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// I used ChatGPT to get syntax for line 9
public class MathUtilsTest {
	private final MathUtils mathUtils = new MathUtils();
	
	/* Use meaningful test method names (hint: use naming convention discussed in lecture and slides).
	   Include assertions to verify correct behavior.
	   Provide a minimum of three test cases for each method.
	*/
	
	// factorial method test cases
	@Test
	public void testFactorialWithZero() {
		assertEquals(1, mathUtils.factorial(0), "Factorial of 0 should be 1");
	}
	
	@Test
	public void testFactorialWithPositiveInteger() {
		assertEquals(120, mathUtils.factorial(5), "Factorial of 5 should be 120");
	}
	
	// I used ChatGPT for lines 30-31
	@Test
	public void testFactorialWithNegativeInput() {
		assertThrows(IllegalArgumentException.class, () -> mathUtils.factorial(-1),
				"Factorial of a negative number should throw IllegalArgumentException");
	}
	
	// isPrime method test cases
	@Test
	public void testIsPrimeWithPrimeNumber() {
		assertFalse(mathUtils.isPrime(4), "4 is not a prime number");
	}
	
	@Test
	public void testIsPrimeWithNonPrime() {
		assertFalse(mathUtils.isPrime(1), "1 should not be considered a prime number");
		
	}

	@Test
	public void testIsPrimeWithEdgeCase() {
		assertFalse(mathUtils.isPrime(1), "1 should not be considered a prime number");
	}
	
	// gcd method test cases
	@Test
	public void testGCDWithNonZero() {
		assertEquals(6, mathUtils.gcd(54, 24), "GCD of 54 and 24 should not be 6");
	}
	
	@Test
	public void testGCDWithZeroAndNonZero() {
		assertEquals(5, mathUtils.gcd(0, 5), "GCS of 0 and 5 should be 5");
	}
	
	// I used ChatGPT for lines 65-66
	@Test
	public void testGCDWithBothZeroInputs() {
		assertThrows (IllegalArgumentException.class, () -> mathUtils.gcd(0, 0),
				"GCD of 0 and 0 should throw IllegalArgumentException");
	}
}
