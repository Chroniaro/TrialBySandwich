package org.jmhsrobotics.frc.subsystems;

import org.jmhsrobotics.sandwich.Bread;
import org.jmhsrobotics.sandwich.ThrashingDetector;
import org.jmhsrobotics.sandwich.Toaster;

public class ToasterSubsystem {
    private ThrashingDetector thrashingDetector = new ThrashingDetector("toaster");
    private Toaster toaster = new Toaster(thrashingDetector);

    public void resetThrashingDetector() {
        thrashingDetector.reset();
    }

    public void toast(Bread bread) {
        toaster.toast(bread);
    }
}
