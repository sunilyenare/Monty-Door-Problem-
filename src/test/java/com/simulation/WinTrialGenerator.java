package com.simulation;

class WinTrialGenerator extends TrialGenerator {
    @Override
    public Trial generate() {
        return new Trial(true, false, false, 1);
    }
}
