package org.jmhsrobotics.sandwich;

public class Bread {
    private int toastiness = 0;

    void toast() {
        ++toastiness;
    }

    public int toastiness() {
        return toastiness;
    }
}
