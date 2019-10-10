package com.simulation.dummyclasses;

import com.simulation.Trial;
import com.simulation.TrialGenerator;

import java.util.Random;

public class LossTrialGenerator extends TrialGenerator {

    public LossTrialGenerator() {

    }

    @Override
    public Trial generate() {
        return new Trial(true, false, false, 2);
    }
}
