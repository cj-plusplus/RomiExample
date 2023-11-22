// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class StudentPath extends SequentialCommandGroup {
  /**
   * Create your own path! Refer to the powerpoint for directions
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public StudentPath(Drivetrain drivetrain) {
    addCommands(
      // Type Here!!
      new DriveDistance(.5, 24.5, drivetrain),
      new TurnDegrees(.5, 80, drivetrain),
      new DriveDistance(.5, 10, drivetrain),
      new TurnDegrees(-.5, 70, drivetrain),
      new DriveDistance(.5, 12, drivetrain)
    );
    reverseStudentPath(drivetrain);
  }

  public void reverseStudentPath(Drivetrain drivetrain) {
    addCommands(
      // Type Here!!
      new DriveDistance(-.5, 10, drivetrain),
      new TurnDegrees(.5, 70, drivetrain),
      new DriveDistance(-.5, 10, drivetrain),
      new TurnDegrees(-.5, 60, drivetrain),
      new DriveDistance(-.5, 23.5, drivetrain) 
    );
  }
}
