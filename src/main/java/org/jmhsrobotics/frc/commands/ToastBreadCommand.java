package org.jmhsrobotics.frc.commands;

import org.jmhsrobotics.frc.Constants;
import org.jmhsrobotics.frc.subsystems.IngredientsSubsystem;
import org.jmhsrobotics.frc.subsystems.ToasterSubsystem;
import org.jmhsrobotics.sandwich.Bread;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class ToastBreadCommand extends CommandBase {
    private ToasterSubsystem toasterSubsystem;
    private IngredientsSubsystem ingredientsSubsystem;

    public ToastBreadCommand(ToasterSubsystem toasterSubsystem, IngredientsSubsystem ingredientsSubsystem) {
        this.toasterSubsystem = toasterSubsystem;
        this.ingredientsSubsystem = ingredientsSubsystem;
    }
    
    @Override
    public void initialize() {
        // The code in this method runs once each time the command begins to run
    }

    @Override
    public void execute() {
        // The code in this method runs repeatedly while the command is being run
    }

    @Override
    public boolean isFinished() {
        // This method determines when the command is finished running
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        // This method runs once each time the command is done running
    }
}
