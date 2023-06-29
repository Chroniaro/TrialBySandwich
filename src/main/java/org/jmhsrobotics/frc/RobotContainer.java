// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.jmhsrobotics.frc;

import org.jmhsrobotics.frc.subsystems.CuttingBoardSubsystem;
import org.jmhsrobotics.frc.subsystems.IngredientsSubsystem;
import org.jmhsrobotics.frc.subsystems.ToasterSubsystem;

import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public final IngredientsSubsystem ingredientsSubsystem = new IngredientsSubsystem();
  public final CuttingBoardSubsystem cuttingBoardSubsystem = new CuttingBoardSubsystem();
  public final ToasterSubsystem toasterSubsystem = new ToasterSubsystem();

  public Command getToastBreadCommand() {
    return null;
  }

  public void resetThrashingDetectors() {
    toasterSubsystem.resetThrashingDetector();
    cuttingBoardSubsystem.resetThrashingDetector();
  }
}
