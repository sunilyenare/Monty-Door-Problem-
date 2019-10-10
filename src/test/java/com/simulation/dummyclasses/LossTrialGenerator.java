package com.simulation.dummyclasses;

import com.simulation.Trial;
import com.simulation.NeverSwapTrialGenerate;
import com.simulation.TrialGenerate;


public class LossTrialGenerator implements TrialGenerate {

    public LossTrialGenerator() {

    }

    @Override
    public Trial generate() {
        return new Trial(true, false, false, 2);
    }
}
