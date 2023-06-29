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

    public void addBread(Bread bread) {
        toaster.addBread(bread);
    }

    public void toast() {
        toaster.toast();
    }

    public void removeBread() {
        toaster.removeBread();
    }

    public boolean hasBread() {
        return toaster.hasBread();
    }
}
