package org.jmhsrobotics.frc.commands;

import org.jmhsrobotics.frc.subsystems.CuttingBoardSubsystem;
import org.jmhsrobotics.frc.subsystems.IngredientsSubsystem;
import org.jmhsrobotics.frc.subsystems.ToasterSubsystem;
import org.jmhsrobotics.sandwich.Bread;
import org.jmhsrobotics.sandwich.Tomato;

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
        Bread bread = ingredientsSubsystem.getBread();
        toasterSubsystem.toast(bread);

        Tomato tomato = ingredientsSubsystem.getTomato();
        if (!tomato.isCut())
            cuttingBoardSubsystem.cut(tomato);
    }

    @Override
    public boolean isFinished() {
        Bread bread = ingredientsSubsystem.getBread();
        Tomato tomato = ingredientsSubsystem.getTomato();
        return bread.toastiness() == 5 && tomato.isCut();
    }
}
