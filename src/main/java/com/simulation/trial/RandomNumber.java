package com.simulation.trial;

import java.util.Random;

public class RandomNumber extends Random {
    @Override
    public int nextInt() {
        return super.nextInt(3)+1;
    }
}
