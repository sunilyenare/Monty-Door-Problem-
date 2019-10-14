package com.simulation.trialswap;

import java.util.Random;

public class ChoiceGenerator {



    public int getRandomChoice(int hostChoice, Random random) {
        int randomChoice;
        do {
            randomChoice = random.nextInt();
        } while (randomChoice == hostChoice);
        return randomChoice;
    }

    public int getHostChoice(int doorWithPrize, int userChoice, Random random) {
        int hostChoice;
        do {
            hostChoice = random.nextInt();
        } while (hostChoice == userChoice || hostChoice == doorWithPrize);
        return hostChoice;
    }

    public int getNewChoice(int hostChoice, int userChoice, Random random) {
        int newChoice;
        do {
            newChoice = random.nextInt();
        } while (newChoice == userChoice || newChoice == hostChoice);
        return newChoice;
    }

}
