package org.jmhsrobotics.sandwich;

public class ThrashingDetector {
    private String name;
    private boolean hasBeenUsed;

    public ThrashingDetector(String name) {
        this.name = name;
        hasBeenUsed = false;
    }

    public void detect() {
        if (hasBeenUsed)
            throw new ThrashingException(name);

        hasBeenUsed = true;
    }

    public void reset() {
        hasBeenUsed = false;
    }
}
