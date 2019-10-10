package com.simulation.dummyclasses;

import java.util.Random;

public class DummyRandomGenerator extends Random {


    private Integer[] numbers;
    int index=0;

    public DummyRandomGenerator(Integer... numbers) {
        this.numbers = numbers;
    }

    @Override
    public int nextInt() {
        if(numbers.length==1){
            return numbers[index];
        }
            return numbers[index++];
    }

}
