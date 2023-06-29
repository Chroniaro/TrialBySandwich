package org.jmhsrobotics.sandwich;

public class CuttingBoard {
    private ThrashingDetector detector;

    public CuttingBoard(ThrashingDetector detector) {
        this.detector = detector;
    }

    public void cut(Cuttable cuttable) {
        detector.detect();
        cuttable.cut();
    }

    public void applyCondiments(Bread bread) {
        bread.applyCondiments();
    }
}
