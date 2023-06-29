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
    void testMakeSandwich() {
        RobotContainer robotContainer = new RobotContainer();
        Command makeSandwichCommand = robotContainer.getMakeSandwichCommand();

        makeSandwichCommand.schedule();

        for (int i = 0; i < 1000; ++i) {
            commandScheduler.run();
            robotContainer.resetThrashingDetectors();
        }

        Bread bread = robotContainer.ingredientsSubsystem.getBread();
        assert bread.toastiness() >= Constants.kDesiredToastiness : "Bread must be toasted!";
        assert bread.toastiness() < 6 : "Bread is burnt!";

        assert bread.hasCondiments() : "Bread must be given condiments!";

        Tomato tomato = robotContainer.ingredientsSubsystem.getTomato();
        assert tomato.isCut() : "Tomato must be cut!";

        Onion onion = robotContainer.ingredientsSubsystem.getOnion();
        assert onion.isCut() : "Onion must be cut!";

        Protein protein = robotContainer.ingredientsSubsystem.getProtein();
        assert protein.isCut() : "Protein must be cut!";
    }
}
