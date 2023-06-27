// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package org.jmhsrobotics.frc;

import org.jmhsrobotics.frc.commands.MakeSandwichCommand;
import org.jmhsrobotics.frc.subsystems.CuttingBoardSubsystem;
import org.jmhsrobotics.frc.subsystems.IngredientsSubsystem;
import org.jmhsrobotics.frc.subsystems.ToasterSubsystem;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

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

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    
  }

  public Command getMakeSandwichCommand() {
    return new MakeSandwichCommand(toasterSubsystem, cuttingBoardSubsystem, ingredientsSubsystem);
  }

  public void resetThrashingDetectors() {
    toasterSubsystem.resetThrashingDetector();
    cuttingBoardSubsystem.resetThrashingDetector();
  }
}
