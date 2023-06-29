package org.jmhsrobotics.frc.commands;

import org.jmhsrobotics.frc.subsystems.CuttingBoardSubsystem;
import org.jmhsrobotics.frc.subsystems.IngredientsSubsystem;
import org.jmhsrobotics.frc.subsystems.ToasterSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class MakeSandwichCommand extends CommandBase {
    private ToasterSubsystem toasterSubsystem;
    private CuttingBoardSubsystem cuttingBoardSubsystem;
    private IngredientsSubsystem ingredientsSubsystem;

    public MakeSandwichCommand(ToasterSubsystem toasterSubsystem, 
            CuttingBoardSubsystem cuttingBoardSubsystem, 
            IngredientsSubsystem ingredientsSubsystem) {
        this.toasterSubsystem = toasterSubsystem;
        this.cuttingBoardSubsystem = cuttingBoardSubsystem;
        this.ingredientsSubsystem = ingredientsSubsystem;
    }

    @Override
    public void execute() {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
