package org.jmhsrobotics.sandwich;

public class Toaster {
    private ThrashingDetector detector;

    public Toaster(ThrashingDetector detector) {
        this.detector = detector;
    }

    public void toast(Bread bread) {
        detector.detect();
        bread.toast();
    }
}
