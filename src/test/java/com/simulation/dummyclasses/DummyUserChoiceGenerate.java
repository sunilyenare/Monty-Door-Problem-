package com.simulation.dummyclasses;

import java.util.Random;

public class DummyUserChoiceGenerate extends Random {
    private int choice;

    public DummyUserChoiceGenerate(int choice) {
        this.choice = choice;
    }

    @Override
    public int nextInt() {
        return choice;
    }
}
