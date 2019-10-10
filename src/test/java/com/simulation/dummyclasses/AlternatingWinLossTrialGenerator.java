package com.simulation.dummyclasses;

import com.simulation.Trial;
import com.simulation.TrialGenerator;


public class AlternatingWinLossTrialGenerator implements TrialGenerator {

    private boolean flag = true;

    public AlternatingWinLossTrialGenerator() {

    }


    @Override
    public Trial generate() {

        if (flag) {
            flag = false;
            return new Trial(true, false, false, 1);
        }
        flag = true;
        return new Trial(true, false, false, 2);
    }

}
