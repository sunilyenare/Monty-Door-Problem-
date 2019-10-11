package com.simulation;


import com.simulation.trialswap.AlwaysSwapTrialGenerator;
import com.simulation.trialswap.NeverSwapTrialGenerator;
import com.simulation.trialswap.RandomSwapTrialGenerator;

public class MainClass {

    public static void main(String[] args) throws Throwable {

        final Simulation simulation = new Simulation(10000, new NeverSwapTrialGenerator(new RandomNumber()));
        System.out.println("Never swap " + simulation.calculateWinningProbability());

        final Simulation simulation2 = new Simulation(10000, new AlwaysSwapTrialGenerator(new RandomNumber()));
        System.out.println("Always swap " + simulation2.calculateWinningProbability());

        final Simulation simulation3 = new Simulation(10000, new RandomSwapTrialGenerator(new RandomNumber()));
        System.out.println("Random swap " + simulation3.calculateWinningProbability());
    }
}
