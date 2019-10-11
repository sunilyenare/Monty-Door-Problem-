package com.simulation;

import com.simulation.dummyclasses.DummyRandomGenerator;
import com.simulation.trial.Trial;
import com.simulation.trialswap.AlwaysSwapTrialGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RandomSwapTrialGeneratorTest {

    /*
      if player randomly select door 1 and host open 3 then return door A
     */

    @Test
    void givenPlayerRandomChoiceIsOneAndHostOpenThree_whenPlayerRandomlySwapChoice_thenShouldReturnDoorA() {
        AlwaysSwapTrialGenerator alwaysSwapTrialGenerator = new AlwaysSwapTrialGenerator(new DummyRandomGenerator(1, 2, 3, 1));
        final Trial actual = alwaysSwapTrialGenerator.generate();

        Trial expected = new Trial(true, false, false, 1);

        assertEquals(expected.status(), actual.status());
    }

}
