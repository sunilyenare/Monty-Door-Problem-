package com.simulation;


public class MainClass {

    public static void main(String[] args) throws Throwable {
      final Simulation simulation = new Simulation(10000, new NeverSwapTrialGenerate(new RandomNumber()));
      System.out.println(simulation.calculateWinningProbability());

    }
}
