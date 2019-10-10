package com.simulation.dummyclasses;

import com.simulation.Trial;
import com.simulation.TrialGenerator;

public class WinTrialGenerator implements TrialGenerator {


    public WinTrialGenerator() {
        super();
    }

    @Override
    public Trial generate() {
        return new Trial(true, false, false, 1);
    }
}
