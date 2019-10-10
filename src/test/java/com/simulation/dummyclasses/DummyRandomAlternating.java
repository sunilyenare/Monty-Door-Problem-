package com.simulation.dummyclasses;

import java.util.Random;

public class DummyRandomAlternating extends Random {

    boolean flag = false;

    @Override
    public int nextInt() {
        if(!flag) {
            flag = true;
            return 1;
        }
        flag = false;
        return 2;
    }
}
