package org.jmhsrobotics.frc.subsystems;

import org.jmhsrobotics.sandwich.CuttingBoard;
import org.jmhsrobotics.sandwich.ThrashingDetector;
import org.jmhsrobotics.sandwich.Tomato;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CuttingBoardSubsystem extends SubsystemBase {
    private ThrashingDetector thrashingDetector = new ThrashingDetector("cutting board");
    private CuttingBoard cuttingBoard = new CuttingBoard(thrashingDetector);

    public void resetThrashingDetector() {
        thrashingDetector.reset();
    }

    public void cut(Tomato tomato) {
        cuttingBoard.cut(tomato);
    }
}
