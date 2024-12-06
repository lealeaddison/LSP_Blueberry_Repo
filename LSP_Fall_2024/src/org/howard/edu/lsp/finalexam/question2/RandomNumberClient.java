package org.howard.edu.lsp.finalexam.question2;


public class RandomNumberClient {

    public static void main(String[] args) {
        // singleton instance of RandomNumberService
        RandomNumberService service = RandomNumberService.getInstance();

        // strategy to Java's built-in Random
        service.setStrategy(new JavaRandomStrategy());
        System.out.println("Random number using Java Random: " + service.generateRandomNumber());

        // strategy to LCG
        service.setStrategy(new LCGRandomStrategy(123456789L));  // Using a specific seed for reproducibility
        System.out.println("Random number using LCG: " + service.generateRandomNumber());
    }
}
