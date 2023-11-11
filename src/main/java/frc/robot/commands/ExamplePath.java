// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class ExamplePath extends SequentialCommandGroup {
  /**
   *
   *
   * @param drivetrain The drive subsystem on which this command will run
   */
  public ExamplePath(Drivetrain drivetrain) {
    addCommands(
      new DriveDistance(0.5,10, drivetrain),
      new TurnDegrees(0.5, 150, drivetrain),
      new DriveDistance(0.5, 10, drivetrain),
      new TurnDegrees(0.5, 150, drivetrain));
  }
}
