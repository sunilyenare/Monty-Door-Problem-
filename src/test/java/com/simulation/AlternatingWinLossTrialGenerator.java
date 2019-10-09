package com.simulation;

class AlternatingWinLossTrialGenerator extends TrialGenerator {

    private boolean flag = true;

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
