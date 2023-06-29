package org.jmhsrobotics.sandwich;

public abstract class Cuttable {
    private String name;
    private boolean isCut;

    public Cuttable(String name) {
        this.name = name;
    }

    void cut() {
        if (isCut)
            throw new CulinaryException("Attempted to cut " + name + " twice!");
        isCut = true;
    }

    public boolean isCut() {
        return isCut;
    }
}
