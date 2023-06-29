package org.jmhsrobotics.sandwich;

import org.jmhsrobotics.frc.Constants;
import org.jmhsrobotics.frc.RobotContainer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.wpi.first.hal.HAL;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.simulation.DriverStationSim;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class SandwichTests {
    CommandScheduler commandScheduler = CommandScheduler.getInstance();

    @BeforeEach
    void setup() {
        HAL.initialize(500, 0);

        DriverStationSim.setEnabled(true);
        DriverStation.refreshData();

        commandScheduler.enable();
    }

    @Test
    void testToastBread() {
        RobotContainer robotContainer = new RobotContainer();
        Command toastBreadCommand = robotContainer.getToastBreadCommand();

        assert toastBreadCommand != null : "RobotContainer.getToastBreadCommand() not implemented!";

        toastBreadCommand.schedule();

        for (int i = 0; i < 1000; ++i) {
            commandScheduler.run();
            robotContainer.resetThrashingDetectors();
        }

        Bread bread = robotContainer.ingredientsSubsystem.getBread();
        assert bread.toastiness() >= Constants.kDesiredToastiness : "Bread must be toasted!";
        assert bread.toastiness() < 6 : "Bread is burnt!";

        assert !robotContainer.toasterSubsystem.hasBread() : "Bread is still in toaster!";
    }
}
