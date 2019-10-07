package com.simulation;

import java.util.Random;

public class TrialGenerator {

    private int randomNumberGenerrator() {
        return new Random().nextInt(3) + 1;
    }


    public Trial generate() {
        boolean doorA = false;
        boolean doorB = false;
        boolean doorC = false;

        int randomNumber = randomNumberGenerrator();
        if (randomNumber == 1) {
            doorA = true;
        }
        if (randomNumber == 2) {
            doorB = true;
        }
        if (randomNumber == 3) {
            doorA = true;
        }
        return new Trial(doorA, doorB, doorC, randomNumber);
    }
}
