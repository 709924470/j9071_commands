package org.usfirst.frc.team9071.robot.commands;

import org.usfirst.frc.team9071.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class DriveTrainCommand extends Command {
	private Joystick js;

    public DriveTrainCommand() {
    	requires(Robot.drivet);
    	requires(Robot.gyro);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	js = Robot.oi.getStick();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivet.drive_polar(js, Robot.gyro.getAngle());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drivet.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drivet.stop();
    }
}
