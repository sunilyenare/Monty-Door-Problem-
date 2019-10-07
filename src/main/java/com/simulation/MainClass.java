package com.simulation;

import java.util.Random;



public class MainClass {

    public static void main(String[] args) {
        final Simulation simulation = new Simulation(1000, new TrialGenerator());
        System.out.println(simulation.calculateWinningProbability());
    }
}
