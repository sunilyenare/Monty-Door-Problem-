package com.simulation.dummyclasses;

import com.simulation.trial.Trial;
import com.simulation.trial.TrialGenerator;

public class WinTrialGenerator implements TrialGenerator {


    public WinTrialGenerator() {
        super();
    }

    @Override
    public Trial generate() {
        return new Trial(true, false, false, 1);
    }
}
