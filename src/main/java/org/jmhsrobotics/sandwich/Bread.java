package org.jmhsrobotics.sandwich;

import org.jmhsrobotics.frc.Constants;

public class Bread {
    private int toastiness = 0;
    private boolean hasCondiments;

    void toast() {
        ++toastiness;
    }

    public int toastiness() {
        return toastiness;
    }

    void applyCondiments() {
        if (hasCondiments)
            throw new CulinaryException("Attempted to apply condiments to toast that already has condiments");
        if (toastiness < Constants.kDesiredToastiness)
            throw new CulinaryException("Attempted to apply condiments to untoasted bread");
        
        hasCondiments = true;
    }

    public boolean hasCondiments() {
        return hasCondiments;
    }
}
