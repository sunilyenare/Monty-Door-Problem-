package com.simulation;

public class Simulation {
    private int numberOfTrial;

    public Simulation(int numberOfTrial) {
        this.numberOfTrial = numberOfTrial;
    }

    public double calculateWinnningProbability(Trial trial) {
        int count=0;
        for(int i=0;i<numberOfTrial;i++){
            if(trial.status())
            {
                count++;
            }
        }
        return count/numberOfTrial;
    }

    public double calculateLosProbability(Trial trial) {
        int count=0;
        for(int i=0;i<numberOfTrial;i++){
            if(trial.status())
            {
                count++;
            }
        }
        return count/numberOfTrial;
    }
}
