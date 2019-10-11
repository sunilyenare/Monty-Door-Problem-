package com.simulation.dummyclasses;

import com.simulation.trial.Trial;
import com.simulation.trial.TrialGenerator;


public class LossTrialGenerator implements TrialGenerator {

    public LossTrialGenerator() {

    }

    @Override
    public Trial generate() {
        return new Trial(true, false, false, 2);
    }
}
