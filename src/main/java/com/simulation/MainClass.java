package com.simulation;

import java.util.Random;



public class MainClass {

    public static void main(String[] args) throws Throwable {
        final Simulation simulation = new Simulation(10000, new TrialGenerator());
        System.out.println(simulation.calculateWinningProbability());
    }
}
