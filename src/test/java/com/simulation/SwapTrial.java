package com.simulation;


public class SwapTrial extends TrialGenerator {

    @Override
    public Trial generate() {
        return new Trial(true, false, false, 1);
    }
}
