package com.simulation;

import java.util.Random;

public class NeverSwapTrialGenerate implements TrialGenerate{
    private Random random;

    public NeverSwapTrialGenerate(Random random) {
        this.random = random;
    }

    public NeverSwapTrialGenerate() {

    }

    @Override
    public Trial generate() {
        boolean doorA = false;
        boolean doorB = false;
        boolean doorC = false;

        int randomNumber = random.nextInt();

        doorA = keepPrice(doorA, randomNumber, 1);
        doorB = keepPrice(doorB, randomNumber, 2);
        doorC = keepPrice(doorC, randomNumber, 3);

        return new Trial(doorA, doorB, doorC, random.nextInt());
    }

    private boolean keepPrice(boolean door, int randomNumber, int i) {
        if (randomNumber == i) {
            door = true;
        }
        return door;
    }


}
