package org.jmhsrobotics.frc.subsystems;

import org.jmhsrobotics.sandwich.Bread;
import org.jmhsrobotics.sandwich.Cuttable;
import org.jmhsrobotics.sandwich.CuttingBoard;
import org.jmhsrobotics.sandwich.ThrashingDetector;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CuttingBoardSubsystem extends SubsystemBase {
    private ThrashingDetector thrashingDetector = new ThrashingDetector("cutting board");
    private CuttingBoard cuttingBoard = new CuttingBoard(thrashingDetector);

    public void resetThrashingDetector() {
        thrashingDetector.reset();
    }

    public void cut(Cuttable cuttable) {
        cuttingBoard.cut(cuttable);
    }

    public void applyCondiments(Bread bread) {
        cuttingBoard.applyCondiments(bread);
    }
}
