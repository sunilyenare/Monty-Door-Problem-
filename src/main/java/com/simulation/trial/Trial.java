package com.simulation.trial;

public class Trial {

    // TODO - maybe primitive obsession
    private final boolean doorA;
    private final boolean doorB;
    private final boolean doorC;
    private int choice;

    // TODO - too many parameters
    public Trial(boolean doorA, boolean doorB, boolean doorC, int choice) {
        this.doorA = doorA;
        this.doorB = doorB;
        this.doorC = doorC;
        this.choice = choice;
    }

    public boolean status() {
        switch (choice) {
            case 1:
                return doorA;
            case 2:
                return doorB;
            case 3:
                return doorC;
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return "Trial{" +
                "doorA=" + doorA +
                ", doorB=" + doorB +
                ", doorC=" + doorC +
                ", choice=" + choice +
                '}';
    }
}
