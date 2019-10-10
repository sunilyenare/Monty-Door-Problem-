package com.simulation;

import java.util.Random;

public class AlwaysSwapTrialGenerator implements TrialGenerator {

    private Random random;

    AlwaysSwapTrialGenerator(Random random) {
        this.random = random;
    }

    @Override
    public Trial generate() {
        boolean doorA;
        boolean doorB;
        boolean doorC;

        int doorWithPrize = random.nextInt();

        doorA = doorWithPrize == 1;
        doorB = doorWithPrize == 2;
        doorC = doorWithPrize == 3;

        int hostChoice;
        int userChoice = random.nextInt();
        int newChoice;

        do {
            hostChoice = random.nextInt();
        } while (hostChoice == userChoice || hostChoice == doorWithPrize);

        do {
            newChoice = random.nextInt();
        } while (newChoice == userChoice || newChoice == hostChoice);

        return new Trial(doorA, doorB, doorC, newChoice);
    }

}
