package com.simulation.dummyclasses;

import com.simulation.Trial;
import com.simulation.TrialGenerator;

import java.util.Random;

public class WinTrialGenerator extends TrialGenerator {




    public WinTrialGenerator() {
        super();
    }

    @Override
    public Trial generate() {
        return new Trial(true, false, false, 1);
    }
}
