package com.simulation.dummyclasses;

import java.util.Random;

public class DummyRandomNumberGenerate extends Random {
    private int value;

    public DummyRandomNumberGenerate(int value) {
        this.value = value;
    }


    public int nextInt() {
        return value;
    }

}