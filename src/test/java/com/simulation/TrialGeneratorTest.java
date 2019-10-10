package com.simulation;

import com.simulation.dummyclasses.DummyRandomAlternating;
import com.simulation.dummyclasses.DummyRandomNumberGenerate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrialGeneratorTest {

    /*
    1. If random number generator generates 1, then only DoorA should be true. The status should be true.


    2. If random number generator generates 2, then only DoorB should be true. The status should be true.
     */


    @Test
    void givenDoorA_whenGenerateRandomNumberOne_theyShouldReturnDoorA() {
        TrialGenerator trialGenerator = new TrialGenerator(new DummyRandomNumberGenerate(1));

        final Trial actual = trialGenerator.generate();
        Trial expected = new Trial(true, false, false, 1);

        assertEquals(expected.status(), actual.status());

    }

    @Test
    void givenDoorB_whenGenerateRandomNumberTwo_theyShouldReturnDoorB() {
        TrialGenerator trialGenerator = new TrialGenerator(new DummyRandomNumberGenerate(2));
        final Trial actual = trialGenerator.generate();
        Trial expected = new Trial(false, true, false, 2);

        assertEquals(expected.status(), actual.status());

    }
    @Test
    void givenDoorC_whenGenerateRandomNumberThree_theyShouldReturnDoorC() {
        TrialGenerator trialGenerator = new TrialGenerator(new DummyRandomNumberGenerate(3));
        final Trial actual = trialGenerator.generate();
        Trial expected = new Trial(false, false, true, 3);

        assertEquals(expected.status(), actual.status());

    }
    @Test
    void givenPlayerChoiceOne_whenCheckForDoorA_thenReturnTrue() {
        TrialGenerator trialGenerator = new TrialGenerator(new DummyRandomAlternating());
        final Trial actual = trialGenerator.generate();

        Trial expected = new Trial(true, false, false, 1);

        assertEquals(expected.status(), actual.status());
    }

}
