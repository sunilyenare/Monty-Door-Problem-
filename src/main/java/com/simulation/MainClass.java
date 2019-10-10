package com.simulation;

import java.util.Random;



public class MainClass {

    public static void main(String[] args) throws Throwable {
      final Simulation simulation = new Simulation(10000, new TrialGenerator(new RandomNumber()));
      System.out.println(simulation.calculateWinningProbability());

    }
}
