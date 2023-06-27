package org.jmhsrobotics.sandwich;

public class ThrashingException extends RuntimeException {
    public ThrashingException(String device) {
        super("Attempted to use " + device + " more than once in a single tick!");
    }
}
