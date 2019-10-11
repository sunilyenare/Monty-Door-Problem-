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
        int count = 0;
        for (int i = 0; i < numberOfTrial; i++) {
            if (trailGenerator.generate().status()) {
                count++;
            }
        }
        return (double) Math.round(count * 1.0 / numberOfTrial * 100) / 100;
    }

}
