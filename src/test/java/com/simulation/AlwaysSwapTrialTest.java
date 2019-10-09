package com.simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlwaysSwapTrialTest {
    @Test
    void givenPlayerSwapingChoiceTwo_whenTrial_thenShouldReturnWin() {

        Trial trial = new Trial(true, false, false, 1);

        assertTrue(trial.status());

    }
}
