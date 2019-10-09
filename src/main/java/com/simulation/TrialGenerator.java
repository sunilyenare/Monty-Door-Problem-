package com.simulation;

import com.simulation.exception.DoorAException;
import com.simulation.exception.DoorBException;
import com.simulation.exception.DoorCException;

import java.util.Random;

public class TrialGenerator {
    int flagDoorA=0;
    int flagDoorB=0;
    int flagDoorC=0;
    private int randomNumberGenerator() {
        return new Random().nextInt(3) + 1;
    }

    public Trial generate() throws Throwable {
        boolean doorA = false;
        boolean doorB = false;
        boolean doorC = false;

        int randomNumber = randomNumberGenerator();
        if (randomNumber == 1) {
            doorA = true;
        }
        if (randomNumber == 2) {
            doorB = true;
        }
        if (randomNumber == 3) {
            doorC = true;
        }

        if(doorA){
            flagDoorA++;
        }
        if(doorB){
            flagDoorB++;
        }
        if(doorC){
            flagDoorC++;
        }

        doorAException();
        doorBException();
        doorCException();

        return new Trial(doorA, doorB, doorC,randomNumberGenerator());
    }

    public void doorCException() throws DoorCException {
        if(flagDoorC==0)
        {
            throw new DoorCException();
        }
    }

    public void doorBException() throws DoorBException {
        if(flagDoorB==0)
        {
            throw new DoorBException();
        }
    }

    public void doorAException() throws DoorAException {
        if(flagDoorA==0)
        {
            throw new DoorAException();
        }
    }

}
