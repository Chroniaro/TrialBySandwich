package org.jmhsrobotics.sandwich;

public class CuttingBoard {
    private ThrashingDetector detector;

    public CuttingBoard(ThrashingDetector detector) {
        this.detector = detector;
    }

    public void cut(Tomato tomato) {
        detector.detect();
        tomato.cut();
    }
}
