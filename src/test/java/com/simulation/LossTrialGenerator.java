package com.simulation;

class LossTrialGenerator extends TrialGenerator {
    @Override
    public Trial generate() {
        return new Trial(true, false, false, 2);
    }
}
