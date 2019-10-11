package com.simulation;

import com.simulation.dummyclasses.DummyRandomGenerator;
import com.simulation.trial.Trial;
import com.simulation.trialswap.NeverSwapTrialGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NeverSwapTrialGeneratorTest {

    /*
    1. If random number generator generates 1, then only DoorA should be true. The status should be true.


    2. If random number generator generates 2, then only DoorB should be true. The status should be true.
     */


    @Test
    void givenDoorA_whenGenerateRandomNumberOne_theyShouldReturnDoorA() {
        NeverSwapTrialGenerator trialGenerator = new NeverSwapTrialGenerator(new DummyRandomGenerator(1));

        final Trial actual = trialGenerator.generate();
        Trial expected = new Trial(true, false, false, 1);

        assertEquals(expected.status(), actual.status());

    }

    @Test
    void givenDoorB_whenGenerateRandomNumberTwo_theyShouldReturnDoorB() {
        NeverSwapTrialGenerator trialGenerator = new NeverSwapTrialGenerator(new DummyRandomGenerator(2));
        final Trial actual = trialGenerator.generate();
        Trial expected = new Trial(false, true, false, 2);

        assertEquals(expected.status(), actual.status());

    }

    @Test
    void givenDoorC_whenGenerateRandomNumberThree_theyShouldReturnDoorC() {
        NeverSwapTrialGenerator trialGenerator = new NeverSwapTrialGenerator(new DummyRandomGenerator(3));
        final Trial actual = trialGenerator.generate();
        Trial expected = new Trial(false, false, true, 3);

        assertEquals(expected.status(), actual.status());

    }


    @Test
    void givenDoorA_whenPlayerSelectTwo_thenReturnFalse() {
        NeverSwapTrialGenerator trialGenerator = new NeverSwapTrialGenerator(new DummyRandomGenerator(1,2));
        final Trial actual = trialGenerator.generate();

        Trial expected = new Trial(true, false, false, 1);

        assertNotEquals(expected.status(), actual.status());
    }

}
