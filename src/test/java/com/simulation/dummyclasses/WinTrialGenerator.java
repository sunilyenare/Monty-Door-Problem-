package com.simulation.dummyclasses;

import com.simulation.Trial;
import com.simulation.NeverSwapTrialGenerate;
import com.simulation.TrialGenerate;

public class WinTrialGenerator implements TrialGenerate {




    public WinTrialGenerator() {
        super();
    }

    @Override
    public Trial generate() {
        return new Trial(true, false, false, 1);
    }
}
