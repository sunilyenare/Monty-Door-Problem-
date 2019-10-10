package com.simulation;

import java.util.Random;

public class TrialGenerator {
    private Random random;

    public TrialGenerator(Random random) {
        this.random = random;
    }

    public TrialGenerator() {

    }


    public Trial generate() {
        boolean doorA = false;
        boolean doorB = false;
        boolean doorC = false;

        int randomNumber = random.nextInt();

        if (randomNumber == 1) {
            doorA = true;
        }
        if (randomNumber == 2) {
            doorB = true;
        }
        if (randomNumber == 3) {
            doorC = true;
        }

        return new Trial(doorA, doorB, doorC, random.nextInt());
    }


}
