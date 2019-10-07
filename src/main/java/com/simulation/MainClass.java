package com.simulation;

import java.util.Random;


//class RandomTrialGenerator {
//
//    public Trial generate() {
//        return new Trial(randomT, randomF, randomF,1);
//    }
//}

public class MainClass {
    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;

    }

    public static void main(String[] args) {
         final Random gen = new Random();
         for(int i=0;i<50;i++){
             int result=gen.nextInt(3)+1;
             System.out.println(result);
         }



   //     new Simulation(100, new RandomTrialGenerator());

    }
}
