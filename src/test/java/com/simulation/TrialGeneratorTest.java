package com.simulation;

import com.simulation.dummyclasses.DummyRandomAlternating;
import com.simulation.dummyclasses.DummyRandomNumberGenerate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TrialGeneratorTest {

    /*
    1. If random number generator generates 1, then only DoorA should be true. The status should be true.


    2. If random number generator generates 2, then only DoorB should be true. The status should be true.
     */


    @Test
    void givenDoorA_whenGenerateRandomNumberOne_theyShouldReturnDoorA() {
        NeverSwapTrialGenerate trialGenerator = new NeverSwapTrialGenerate(new DummyRandomNumberGenerate(1));

        final Trial actual = trialGenerator.generate();
        Trial expected = new Trial(true, false, false, 1);

        assertEquals(expected.status(), actual.status());

    }

    @Test
    void givenDoorB_whenGenerateRandomNumberTwo_theyShouldReturnDoorB() {
        NeverSwapTrialGenerate trialGenerator = new NeverSwapTrialGenerate(new DummyRandomNumberGenerate(2));
        final Trial actual = trialGenerator.generate();
        Trial expected = new Trial(false, true, false, 2);

        assertEquals(expected.status(), actual.status());

    }

    @Test
    void givenDoorC_whenGenerateRandomNumberThree_theyShouldReturnDoorC() {
        NeverSwapTrialGenerate trialGenerator = new NeverSwapTrialGenerate(new DummyRandomNumberGenerate(3));
        final Trial actual = trialGenerator.generate();
        Trial expected = new Trial(false, false, true, 3);

        assertEquals(expected.status(), actual.status());

    }


    @Test
    void givenDoorA_whenPlayerSelectTwo_thenReturnFalse() {
        NeverSwapTrialGenerate trialGenerator = new NeverSwapTrialGenerate(new DummyRandomAlternating());
        final Trial actual = trialGenerator.generate();

        Trial expected = new Trial(true, false, false, 1);

        assertNotEquals(expected.status(), actual.status());
    }

}
