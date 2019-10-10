package com.simulation;

import com.simulation.dummyclasses.DummyRandomGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AlwaysSwapTrialGeneratorTest {

    @Test
    void givenPlayerNewChoiceIsOneAndHostOpenThree_whenPlayerSwapChoice_thenShouldReturnDoorA() {
        AlwaysSwapTrialGenerator alwaysSwapTrialGenerator = new AlwaysSwapTrialGenerator(new DummyRandomGenerator(1, 2, 3, 1));
        final Trial actual = alwaysSwapTrialGenerator.generate();

        Trial expected = new Trial(true, false, false, 1);

        assertEquals(expected.status(), actual.status());
    }

}
