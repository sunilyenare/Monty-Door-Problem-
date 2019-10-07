package com.simulation;

public class Simulation {
    private int numberOfTrial;
    private TrailGenerator trailGenerator;

    // TODO - Simulation is not parameterized on choice.
    public Simulation(int numberOfTrial, TrailGenerator trailGenerator) {
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
