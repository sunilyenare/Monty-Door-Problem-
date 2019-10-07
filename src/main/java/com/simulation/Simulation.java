package com.simulation;

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
        return count * 1.0 / numberOfTrial;
    }

}
