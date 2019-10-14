package com.simulation.trialswap;

import com.simulation.trial.Trial;
import com.simulation.trial.TrialGenerator;

import java.util.Random;

public class RandomSwapTrialGenerator extends  ChoiceGenerator implements TrialGenerator {

    private Random random;

    public RandomSwapTrialGenerator(Random random) {
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
        int randomChoice;

        hostChoice = getHostChoice(doorWithPrize, userChoice,random);

        randomChoice = getRandomChoice(hostChoice,random);

        return new Trial(doorA, doorB, doorC, randomChoice);
    }



}
