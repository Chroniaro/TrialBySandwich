package org.jmhsrobotics.sandwich;

public class Toaster {
    private ThrashingDetector detector;
    private Bread currentBread = null;

    public Toaster(ThrashingDetector detector) {
        this.detector = detector;
    }

    public void addBread(Bread bread) {
        if (currentBread != null)
            throw new CulinaryException("Attempted to add more than one bread to toaster at once!");
        
        currentBread = bread;
    }

    public void toast() {
        if (currentBread == null)
            throw new CulinaryException("Attempted to run toaster with no bread!");

        detector.detect();
        currentBread.toast();
    }

    public void removeBread() {
        if (currentBread == null)
            throw new CulinaryException("Attempted to remove bread from empty toaster!");
        
        currentBread = null;
    }

    public boolean hasBread() {
        return currentBread != null;
    }
}
