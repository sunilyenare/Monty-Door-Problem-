package com.simulation;

import java.util.Random;

public class TrialGenerator {
    private int randomNumber = randomNumberGenerate();
    private boolean doorA = false;
    private boolean doorB = false;
    private boolean doorC = false;

    private int randomNumberGenerate() {
        return new Random().nextInt(3) + 1;
    }


    public Trial generate() {
        if (isDoorA()) {
            doorA = true;
        }
        if (isDoorB()) {
            doorB = true;
        }
        if (isDoorC()) {
            doorC = true;
        }
        return new Trial(doorA, doorB, doorC, randomNumber);
    }

    private boolean isDoorC() {
        return randomNumber == 3;
    }

    private boolean isDoorB() {
        return randomNumber == 2;
    }

    private boolean isDoorA() {
        return randomNumber == 1;
    }
}
