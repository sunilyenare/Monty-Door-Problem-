package com.simulation;

import java.util.Random;



public class MainClass {

    public static void main(String[] args) {
         final Random gen = new Random();
         for(int i=0;i<50;i++){
             int result=gen.nextInt(3)+1;
             System.out.println(result);
         }
    }
}
