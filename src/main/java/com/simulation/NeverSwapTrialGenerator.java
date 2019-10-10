package com.simulation;

import java.util.Random;

public class NeverSwapTrialGenerator implements TrialGenerator {
    private Random random;

    public NeverSwapTrialGenerator(Random random) {
        this.random = random;
    }

    @Override
    public Trial generate() {
        boolean doorA;
        boolean doorB;
        boolean doorC;

        int randomNumber = random.nextInt();

        doorA = randomNumber == 1;
        doorB = randomNumber == 2;
        doorC = randomNumber == 3;

        return new Trial(doorA, doorB, doorC, random.nextInt());
    }

}
