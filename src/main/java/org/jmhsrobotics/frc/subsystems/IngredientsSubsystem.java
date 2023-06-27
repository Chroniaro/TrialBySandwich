package org.jmhsrobotics.frc.subsystems;

import org.jmhsrobotics.sandwich.Bread;
import org.jmhsrobotics.sandwich.Tomato;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IngredientsSubsystem extends SubsystemBase {
    private Bread bread = new Bread();
    private Tomato tomato = new Tomato();

    public Bread getBread() {
        return bread;
    }

    public Tomato getTomato() {
        return tomato;
    }
}
