package com.simulation.dummyclasses;

import java.util.Random;

public class DummyRandomAlternating extends Random {

    boolean flag = true;

    @Override
    public int nextInt() {
        if(flag) {
            flag = false;
            return 1;
        }
        flag = true;
        return 2;
    }
}
