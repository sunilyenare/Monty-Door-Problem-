package com.simulation;


public class MainClass {

    public static void main(String[] args) throws Throwable {

        final Simulation simulation = new Simulation(10000, new NeverSwapTrialGenerator(new RandomNumber()));
        System.out.println("Never swap " + simulation.calculateWinningProbability());

        final Simulation simulation2 = new Simulation(10000, new AlwaysSwapTrialGenerator(new RandomNumber()));
        System.out.println("Always swap " + simulation2.calculateWinningProbability());

    }
}
