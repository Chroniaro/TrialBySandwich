package org.jmhsrobotics.sandwich;

public class Tomato {
    private boolean isCut = false;

    void cut() {
        assert !isCut : "Attempted to cut tomato twice!";
        isCut = true;
    }

    public boolean isCut() {
        return isCut;
    }
}
