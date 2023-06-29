package org.jmhsrobotics.frc.subsystems;

import org.jmhsrobotics.sandwich.Bread;
import org.jmhsrobotics.sandwich.Onion;
import org.jmhsrobotics.sandwich.Protein;
import org.jmhsrobotics.sandwich.Tomato;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IngredientsSubsystem extends SubsystemBase {
    private Bread bread = new Bread();
    private Tomato tomato = new Tomato();
    private Onion onion = new Onion();
    private Protein protein = new Protein();

    public Bread getBread() {
        return bread;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public Onion getOnion() {
        return onion;
    }

    public Protein getProtein() {
        return protein;
    }
}
