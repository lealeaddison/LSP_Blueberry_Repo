package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

public class RandomNumberService {

  
    private static RandomNumberService instance;

    
    private RandomNumberStrategy strategy;

    
    private RandomNumberService() {}

    // I used ChatGPT to help with lines 17-21
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

   
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

   
    public int generateRandomNumber() {
        return strategy.generateRandomNumber();
    }
}
