package com.simulation;

import com.simulation.trial.TrialGenerator;

public class Simulation {
    private int numberOfTrial;
    private TrialGenerator trailGenerator;


    public Simulation(int numberOfTrial, TrialGenerator trailGenerator) {
        this.numberOfTrial = numberOfTrial;
        this.trailGenerator = trailGenerator;
    }

    public double calculateWinningProbability() {
        int win = 0;
        for (int i = 0; i < numberOfTrial; i++) {
            if (trailGenerator.generate().status()) {
                win++;
            }
        }
        return getProbability(win);
    }

    private double getProbability(int count) {
        return (double) Math.round(count * 1.0 / numberOfTrial * 100) / 100;
    }

}
