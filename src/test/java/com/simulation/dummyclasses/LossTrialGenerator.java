package com.simulation.dummyclasses;

import com.simulation.Trial;
import com.simulation.TrialGenerator;


public class LossTrialGenerator implements TrialGenerator {

    public LossTrialGenerator() {

    }

    @Override
    public Trial generate() {
        return new Trial(true, false, false, 2);
    }
}
