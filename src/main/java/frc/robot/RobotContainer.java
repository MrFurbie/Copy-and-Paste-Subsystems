// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants;
import frc.robot.commands.Autos;
import frc.robot.subsystems.Converyer;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.PneumaticIntake;
import frc.robot.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;


public class RobotContainer {

  // The robot's subsystems and commands are defined here
  
  private final Intake intake = new Intake();

  private final PneumaticIntake pIntake = new PneumaticIntake();

  private final Shooter shooter = new Shooter();

  private final Converyer converyer = new Converyer();

  // Controller Ports

  private final CommandXboxController driverController = new CommandXboxController(Constants.xboxPort);

  public RobotContainer () {

    configureBindings ();

  }

  private void configureBindings () {

    // Map your buttons to your commands here

  }

}
