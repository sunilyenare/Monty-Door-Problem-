package com.simulation;

public class Simulation {
    private int numberOfTrial;
    private TrialGenerate trailGenerator;


    public Simulation(int numberOfTrial, TrialGenerate trailGenerator) {
        this.numberOfTrial = numberOfTrial;
        this.trailGenerator = trailGenerator;
    }

    public double calculateWinningProbability() throws Throwable {
        int count = 0;
        for (int i = 0; i < numberOfTrial; i++) {
            if (trailGenerator.generate().status()) {
                count++;
            }
        }
        return (double) Math.round(count * 1.0 / numberOfTrial * 100) / 100;
    }

}
